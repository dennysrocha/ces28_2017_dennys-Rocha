package Q4.orig;

import java.util.Iterator;


public class Calculadora {
	public void imprime(Iterator<Despesa> despesas) {
		float totalDespesa = 0.0f;
		while (despesas.hasNext()) {
			Despesa desp = despesas.next();
			float despesa = desp.getDespesa();
			totalDespesa+= despesa;
		}
		String conteudo = "Relat�rio de Despesas";
		conteudo+=("\n Total das despesas:" + totalDespesa);

		SistemaOperacional so = new SistemaOperacional();
		so.getDriverImpressao(conteudo);
	}
}
