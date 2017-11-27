package testes;

import model.Informacao;
import model.Mapa;
import model.SistemaControleUTM_CTR;
import presenter.EstacoesGCS;
import view.DroneARP;

import static org.mockito.Mockito.*;

public class SetupDataAndExpectations { 
	/*
	 * N�o deu tempo de fazer os retornos serem funcionais! Prova muito trabalhosa :(
	 */
	
	static public SistemaControleUTM_CTR mockSistema() {
		SistemaControleUTM_CTR sistemaMock = mock(SistemaControleUTM_CTR.class);
		Mapa mapa;
		when(sistemaMock.gerarMapas(mapa)).thenReturn("Mapa atualizado\nMapa atualizado\nMapa atualizado");
		Informacao info;
		when(sistemaMock.tratarInformacoes(info)).thenReturn("Mapa atualizado\\nMapa atualizado\\nMapa atualizado");
		
		return sistemaMock;
	}
	
	static public DroneARP mockDrone() {
		DroneARP droneMock = mock(DroneARP.class);
		Mapa mapa;
		when(droneMock.detectarObstaculos()).thenReturn("O drone detectou um obst�culo!");
		Informacao info;
		when(droneMock.enviarInfo()).thenReturn("O drone recebeu comando ou enviou informa��o!\nA esta��o est� recebendo ou enviando informa��es ao drone!");
		when(droneMock.evitarColisoes()).thenReturn("Aten��o: colis�o prevista. Atualize os mapas!");
		return droneMock;
	}
	
	static public EstacoesGCS mockEstacao() {
		EstacoesGCS estacaoMock = mock(EstacoesGCS.class);
		when(estacaoMock.enviarInfo()).thenReturn("O drone recebeu comando ou enviou informa��o!\nA esta��o est� recebendo ou enviando informa��es ao drone!");
		
		return estacaoMock;
	}
	/*
	*/
	
}
