package Q4.ptc;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.junit.rules.ExpectedException;


public class ControladorTest {
	
	@Rule
    public ExpectedException expectedException = ExpectedException.none();
	
	private ControladorPTC controlador;
	private Datacenter dataCenter;
	private PainelCondutor painelCond;
	private Sensor sensor;
		
	@Test
	public void testaCruzamento() {
		//ControladorPTC controladorDummy = mock(ControladorPTC.class);
		Sensor sensorMock = mock(Sensor.class);
		ControladorPTC controlador = new ControladorPTC(sensorMock, dataCenter, painelCond);
		when(sensorMock.isCruzamento()).thenReturn(false);
		Assert.assertFalse(controlador.sensor.isCruzamento());
	}
	
	public void testaCruzamento100() {
		Sensor sensorMock = mock(Sensor.class);
		ControladorPTC controlador = new ControladorPTC(sensorMock, dataCenter, painelCond);
		when(sensorMock.isCruzamento()).thenReturn(true);
		Assert.assertFalse(controlador.sensor.isCruzamento());
	}
	
	public void testaCruzamento100() {
		
	}
	
	public void testaCruzamento20() {
		
	}
}
