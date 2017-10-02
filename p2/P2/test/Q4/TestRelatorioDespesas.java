package Q4;

import org.junit.Test;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import Q4.orig.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestRelatorioDespesas {
	@Test
	public void testaRelatorioDespesasStub() throws IOException {
		//setup
		Despesa despesaStub1 = mock(Despesa.class);
		Despesa despesaStub2 = mock(Despesa.class);
		Despesa despesaStub3 = mock(Despesa.class);
		Despesa despesaStub4 = mock(Despesa.class);
			
		
		//expectativa
		when(despesaStub1.getDespesa()).thenReturn(1.30f);
		when(despesaStub2.getDespesa()).thenReturn(2.40f);
		when(despesaStub3.getDespesa()).thenReturn(5.70f);
		when(despesaStub4.getDespesa()).thenReturn(6.80f);
		
		//exercicio
		ArrayList<Despesa> despesas = new ArrayList<>();
		despesas.add(despesaStub1);
		despesas.add(despesaStub2);
		despesas.add(despesaStub3);
		despesas.add(despesaStub4);
		
		RelatorioDespesas relatorio = new RelatorioDespesas();		
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
        relatorio.ImprimirRelatorio(despesas.iterator());
        buffer.flush();
        String mensagem = new String(buffer.toByteArray()); 
        
		
		//verificacao
        assertTrue(mensagem.contains("Relatório de Despesas"+"\n Total das despesas:" + 16.20f));
	
        
        /* comentarios do meu codigo e da minha interpretação:
        professor, sinceramente eu fiquei muito em dúvida sobre o que testar... acredito que os testes dependam da refatoração/remoção de maus cheiros feitas
        no item a) e isso é um tanto quanto subjetivo... veja que meus métodos são quase que por inteiros do tipo void, ou seja, não tenho retornos bem
        definidos em variáveis mas sim outputs, então o que eu fiz foi comparar uma string com a saída do meu Output usando stub */
	}
}
