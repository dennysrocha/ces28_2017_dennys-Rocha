package testes;

import model.Informacao;
import model.Mapa;
import model.SistemaControleUTM_CTR;
import presenter.EstacoesGCS;
import view.DroneARP;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseAndVerifyTest {
	
	private DroneARP drone1;
	private DroneARP drone2;
	private DroneARP drone3;
	private EstacoesGCS gcs1;
	private EstacoesGCS gcs2;
	private EstacoesGCS gcs3;
	private SistemaControleUTM_CTR sistema;
	
	@Before
	public void exercise() {
		drone1 = SetupDataAndExpectations.mockDrone();
		drone2 = SetupDataAndExpectations.mockDrone();
		drone3 = SetupDataAndExpectations.mockDrone();
		gcs1 = SetupDataAndExpectations.mockEstacao();
		gcs2 = SetupDataAndExpectations.mockEstacao();
		gcs3 = SetupDataAndExpectations.mockEstacao();
		sistema = SetupDataAndExpectations.mockSistema();
	}
	
	public void testDrone() {
		String desiredString = "O drone detectou um obstáculo!";
		assertEquals(desiredString, drone1.detectarObstaculos());
		assertEquals(desiredString, drone2.detectarObstaculos());
		assertEquals(desiredString, drone3.detectarObstaculos());
		desiredString = "O drone recebeu comando ou enviou informação!\nA estação está recebendo ou enviando informações ao drone!";
		assertEquals(desiredString, drone1.enviarInfo());
		assertEquals(desiredString, drone2.enviarInfo());
		assertEquals(desiredString, drone3.enviarInfo());
		desiredString = "Atenção: colisão prevista. Atualize os mapas!";
		assertEquals(desiredString, drone1.detectarObstaculos());
		assertEquals(desiredString, drone2.detectarObstaculos());
		assertEquals(desiredString, drone3.detectarObstaculos());
	}
	
	public void testEstacao() {
		String desiredString = "O drone recebeu comando ou enviou informação!\nA estação está recebendo ou enviando informações ao drone!";
		assertEquals(desiredString, gcs1.enviarInfo());
	}
	
	public void testSistema() {
		String desiredString = "Mapa atualizado\\nMapa atualizado\\nMapa atualizado";
		Mapa mapa;
		assertEquals(desiredString, sistema.gerarMapas(mapa));
		Informacao info;
		assertEquals(desiredString, sistema.tratarInformacoes(info));
	}
	
}
