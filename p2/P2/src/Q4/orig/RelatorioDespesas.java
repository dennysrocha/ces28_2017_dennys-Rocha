package Q4.orig;

import java.util.Iterator;

public class RelatorioDespesas {
	public void ImprimirRelatorio(Iterator<Despesa> despesas) {
		Calculadora calculadora = new Calculadora ();
		calculadora.imprime(despesas);
	}
}