package Q3.TireMonitor;

public class Check extends Alarm {
	private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;
    
	Sensor sensor = new Sensor();
	
	public boolean checkingThePressure() {
		double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            return true;
        }
		return false;
	}
}
