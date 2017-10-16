import java.util.Observable;
import java.util.Observer;

class Object implements Observer {
	
	Observable revistaInformatica;
	
	int edicaoNovaRevista;
	
	public Object(Observable revistaInformatica) {
		this.revistaInformatica = revistaInformatica;
		revistaInformatica.addObserver(this);
	}
	
	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		if (revistaInfSubject instanceof Subject) {
			Subject revistaInformatica = (Subject) revistaInfSubject;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			System.out.println("Aten��o, j� chegou a mais uma edi��o da Revista Informatica. " +
					"Esta � a sua edi��o n�mero: " + edicaoNovaRevista);
		}
	}	
}