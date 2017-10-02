package Q4.orig;

public class SistemaOperacional {
	public Impressora getDriverImpressao(String conteudo) {
		return new Impressora(conteudo);
	}
}
