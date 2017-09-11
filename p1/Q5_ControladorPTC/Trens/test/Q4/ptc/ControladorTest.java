package Q4.ptc;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.junit.rules.ExpectedException;


public class ControladorTest {
	
	@Rule
    public ExpectedException expectedException = ExpectedException.none();
	
	public ControladorPTC controlador;
	private Datacenter dataCenter;
	private PainelCondutor painelCond;
	public Sensor sensor;
		
	
	
	@Test
	public void testaInicializacao() {
		ControladorPTC controladorDummy = mock(ControladorPTC.class);
		ControladorPTC controlador = new ControladorPTC(sensor, dataCenter, painelCond);
		Assert.assertTrue(controlador!=null);
		Assert.assertTrue(controladorDummy!=null);
	}
	
	@Test
	public void testaCruzamento() {
		//ControladorPTC controladorDummy = mock(ControladorPTC.class);
		Sensor sensorMock = mock(Sensor.class);
		when(sensorMock.isCruzamento()).thenReturn(false);
		ControladorPTC controlador = new ControladorPTC(sensorMock, dataCenter, painelCond);
		Assert.assertFalse(sensorMock.isCruzamento());
	}
		
	@Test
	public void testaCruzamento100() {
		Sensor sensorMock = mock(Sensor.class);
		PainelCondutor painelMock = mock(PainelCondutor.class);
		when(sensorMock.isCruzamento()).thenReturn(true); // isCruzamento() de sensor retorna verdadeiro
		when(sensorMock.getVelocidade()).thenReturn(110.00); // velocidade superior a 100
		when(painelMock.imprimirAviso("anything", 1)).thenReturn(true);
		ControladorPTC controlador = new ControladorPTC(sensorMock, dataCenter, painelMock);
		Assert.assertTrue(sensorMock.isCruzamento() && controlador.enviaMsgPrioritariaPainel("anything", painelMock));
	}
	
	@Test
	public void testaCruzamento20() {
		Sensor sensorMock = mock(Sensor.class);
		PainelCondutor painelMock = mock(PainelCondutor.class);
		when(sensorMock.isCruzamento()).thenReturn(true); // isCruzamento() de sensor retorna verdadeiro
		when(sensorMock.getVelocidade()).thenReturn(10.00); // velocidade inferior a 20
		when(painelMock.imprimirAviso("anything", 1)).thenReturn(false);
		ControladorPTC controlador = new ControladorPTC(sensorMock, dataCenter, painelMock);
		Assert.assertTrue(sensorMock.isCruzamento() && !controlador.enviaMsgPrioritariaPainel("anything", painelMock));
	}
	
	


	
}
