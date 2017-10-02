package Q3;

import org.junit.Assert;
import org.junit.Test;

import Q3.TireMonitor.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class TestAlarm {
	
	@Test
	public void testaSensorMock() {
		//setup
		Alarm alarm1 = new Alarm();
		Alarm alarm2 = new Alarm();
		Check check1 = mock(Check.class);
		Check check2 = mock(Check.class);
		
		//expectativa
		when(check1.checkingThePressure()).thenReturn(true);
		when(check2.checkingThePressure()).thenReturn(false);
		
		//exercicio
		alarm1.setAlarm(check1); 
		alarm2.setAlarm(check2); 
		
		//verificacao
		Assert.assertTrue(alarm1.isAlarmOn());
		Assert.assertFalse(alarm2.isAlarmOn());
		verify(check1,times(1)).checkingThePressure();
		verify(check2,times(1)).checkingThePressure();
		
	}
}
