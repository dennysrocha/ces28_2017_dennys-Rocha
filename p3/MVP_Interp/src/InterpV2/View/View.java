package InterpV2.View;


import java.io.File;
import java.util.Observable;
import java.util.Observer;
import InterpV2.Presenter.Presenter;



public class View implements Observer{
	double _value;
	File _file;
	Observable p;
	
	public View(Observable p) {
		bind(p);
	}
	
	private void bind(Observable p) {
		this.p = p;
		this.p.addObserver(this);
	}
	
	public File getDataFile() {
		return _file;
	}
		
	public void getMethod(String method) {
		Presenter p2;
		p2 = (Presenter) p;
		p2.getMethod(method);
	}
	
	public void calculateResult(float value, File file) {
		Presenter p2;
		p2 = (Presenter) p;
		_value = value;
		_file = file;
		p2.calculateResult(value, file);
		/* printResult(); */ // Esse print já coloquei antes de dar setChanged() no calculateResult() do Presenter
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		// TODO
	}
	

}