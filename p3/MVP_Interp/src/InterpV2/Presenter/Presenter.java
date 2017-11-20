package InterpV2.Presenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Observable;
import java.util.StringTokenizer;
import java.util.Vector;

import InterpV2.Model.CubicSpline;
import InterpV2.Model.InterpolationMethod;
import InterpV2.Model.Lagrange;


public class Presenter extends Observable {
	private InterpolationMethod interpolationModel;
    private FileReader input;
    private BufferedReader bufRead;
    private StringTokenizer xy;
    private double _value, result;
    private File _file;
    private Vector<Double> x, y;
    private final String CS_METHOD = "Cubic Spline";
    private final String L_METHOD = "Lagrange";
    private DecimalFormat formatResult = new DecimalFormat("####.######");
    private final String DEFAULT_METHOD = CS_METHOD;
    HashMap<String, String> metodo = new HashMap<>();
    
    public Presenter() {
    	metodo.put("CS_METHOD", "Cubic Spline");
    	metodo.put("L_METHOD", "Lagrange");
    	metodo.put("DEFAULT_METHOD", "CS_METHOD");
   
        bind();
     }
    
    public void newMethod(String method, String algorithm) {
		metodo.put(method, algorithm);
    }

    public void bind() {
        
        interpolationModel = (InterpolationMethod) getMethod(DEFAULT_METHOD);
    }

    public File getDataFile() {
        
        return _file;
    }

    public InterpolationMethod getMethod() { return interpolationModel; }
    public InterpolationMethod getMethod(String method) {
        switch (method) {
            case L_METHOD:
                interpolationModel = new Lagrange();
                break;
            case CS_METHOD:
                interpolationModel = new CubicSpline();
                break;
            default:
            	System.out.println("Unknown method " + method);
        }

        return interpolationModel;
    }

    public void calculateResult(float value, File file) {
        _value = value;
        buildDataPoints(file);
        if(getMethod() != null) {
            result = getMethod().calculateResult(_value, x, y);
            printResult();
            setChanged();
            notifyObservers(result);
        } else {
            System.out.println("It is not defined an interpolation method.");
        }
    }

    private void printResult() {
    	System.out.println("***********************");
    	System.out.println("DataFile: " + getDataFile());
    	System.out.println("Interp at " + formatResult.format(_value) + " ; result = " + formatResult.format(result));
	}

	private void buildDataPoints(File file) {
        if(file == null)
           return;
        else _file = file;

        x = new Vector<Double>();
        y = new Vector<Double>();
        try {
            input = new FileReader(_file);
            bufRead = new BufferedReader(input);
            String line = bufRead.readLine();
            while (line != null){
                xy = new StringTokenizer(line, "\t ");
                while(xy.hasMoreTokens()) {
                    x.addElement(Double.parseDouble(xy.nextToken()));
                    System.out.println("x eh " + x.lastElement());
                    y.addElement(Double.parseDouble(xy.nextToken()));
                    System.out.println("y eh " + y.lastElement());
                }
                line = bufRead.readLine();
            }
            bufRead.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}