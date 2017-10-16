import java.util.Observable;

public class Subject extends Observable {

	private int edicao;

	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;
		
		setChanged();
		notifyObservers();
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	public static void main(String[] args) {
		//poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 3;
		Subject revistaInformatica = new Subject();		
		Object assinante1 = new Object(revistaInformatica);
		
		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}