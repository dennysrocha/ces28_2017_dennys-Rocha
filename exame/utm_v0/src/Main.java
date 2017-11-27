import model.Informacao;
import model.Mapa;
import model.SistemaControleUTM_CTR;
import presenter.EstacoesGCS;
import view.DroneARP;

public class Main {

	private static DroneARP drone1 = new DroneARP();
	private static EstacoesGCS gcs1 = new EstacoesGCS(drone1);
	private static DroneARP drone2 = new DroneARP();
	private static EstacoesGCS gcs2 = new EstacoesGCS(drone2);
	private static DroneARP drone3 = new DroneARP();
	private static EstacoesGCS gcs3 = new EstacoesGCS(drone3);
	private static SistemaControleUTM_CTR sistema = new SistemaControleUTM_CTR();
	private static Mapa mapa = new Mapa();
	private static Informacao info = new Informacao();
	
	public static void main(String[] args) {
		gcs1.addObserver(drone1);
		gcs2.addObserver(drone2);
		gcs3.addObserver(drone3);
		drone1.setObservable(gcs1);
		drone2.setObservable(gcs2);
		drone3.setObservable(gcs3);
		sistema.addEstacao(gcs1);
		sistema.addEstacao(gcs2);
		sistema.addEstacao(gcs3);
		
		
		System.out.println("Exemplo - Drone 1:");
		System.out.println("Comando: detectarObstaculos():");
		drone1.detectarObstaculos();
		System.out.println("Comando: enviarInfo():");
		drone1.enviarInfo();
		System.out.println("Comando: evitarColisoes():");
		drone1.evitarColisoes();
		
		System.out.println("------------------------\nExemplo - GCS 1:");
		System.out.println("Comando: enviarInfo():");
		gcs1.enviarInfo();
		
		
		System.out.println("------------------------\nSistema:");
		System.out.println("Comando: gerarMapas():");
		sistema.gerarMapas(mapa); //printa 3 vezes por que sao 3 subjects
		System.out.println("Comando: tratarInformacoes():");
		sistema.tratarInformacoes(info);

		
		
	}
	
}
