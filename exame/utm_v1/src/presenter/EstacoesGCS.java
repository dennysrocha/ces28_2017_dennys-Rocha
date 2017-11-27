package presenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import view.IDroneARP;
import model.ISistemaControleUTM_CTR;
import model.Mapa;


public class EstacoesGCS extends Observable {
	
	private static EstacoesGCS instancia;
	private List<IDroneARP> observers = new ArrayList<IDroneARP>(); //eu sei que tem apenas um observer no problema, mas isso serve p/ extens�es
	private Mapa mapa;
	private ISistemaControleUTM_CTR sistemaControle;

	public EstacoesGCS(IDroneARP drone) {//implementar
		this.observers.add(drone);
	}
	
	public static EstacoesGCS getInstancia(IDroneARP drone) {// padr�o Singleton!
        if (instancia==null) {
            instancia = new EstacoesGCS(drone);
        }
        return instancia;
    }
	
	public void comandarDrone() {//implementar
		enviarInfo();
		System.out.println("A esta��o est� enviando um comando ao drone!");
	}
		
	public void receberInfo() {//implementar
		System.out.println("A esta��o est� recebendo ou enviando informa��es ao drone!");
	}

	public void enviarInfo() {//notifyObservers()
        for (IDroneARP observer:this.observers) {
            observer.update();
        }
    }
	
	public void atualizarMapa(Mapa mapa) {
		this.mapa = mapa;
		System.out.println("Mapa atualizado");
	}
}
