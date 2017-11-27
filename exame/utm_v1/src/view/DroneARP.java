package view;

import java.util.Observable;
import java.util.Observer;

import presenter.EstacoesGCS;

public class DroneARP implements Observer, IDroneARP {

	EstacoesGCS p;
	
	public DroneARP() {//implementar
		
	}
	
	public void update() {//implementar
		System.out.println("O drone recebeu comando ou enviou informação!");
		p.receberInfo();
	}
	
	public void setObservable(EstacoesGCS p) {
		this.p = p;
	}
	
	public void detectarObstaculos() {//implementar
		System.out.println("O drone detectou um obstáculo!");
	}
	
	public void evitarColisoes() {//implementar
		System.out.println("Atenção: colisão prevista. Atualize os mapas!");
		//atualizarMapa();
	}
	
	public void enviarInfo() {
		update();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}


	
	

}
