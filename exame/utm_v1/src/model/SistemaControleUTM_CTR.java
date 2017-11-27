package model;

import java.util.ArrayList;
import java.util.List;

import presenter.EstacoesGCS;
import view.IDroneARP;

public class SistemaControleUTM_CTR implements ISistemaControleUTM_CTR {

	private Informacao info;
	private Mapa mapa;
	private List<EstacoesGCS> estacoes = new ArrayList<EstacoesGCS>();
	
	@Override
	public void tratarInformacoes(Informacao info) {
		this.info = info;
		//trata as informacoes (decodificando, manipulando, etc)
		
		Mapa mapa = new Mapa();
		//coloca as informações no mapa
		gerarMapas(mapa);
	}
	
	public void addEstacao(EstacoesGCS estacao) {
		this.estacoes.add(estacao);
	}
	
	@Override
	public void gerarMapas(Mapa mapa) {
		this.mapa = mapa;
		//trata o mapa, sobrescrevendo-o ou adicionando pedaços de mapas, etc
		//a cada 20 sec, atualiza o mapa de cada estacao
		for (EstacoesGCS estacao:this.estacoes) {
            estacao.atualizarMapa(this.mapa);
        }
	}

}
