package Q3.TireMonitor;


public class Alarm
{
    
    private boolean alarmOn = false;
    
    public void setAlarm(Check check) {
    	alarmOn = check.checkingThePressure();
    }
    
    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}