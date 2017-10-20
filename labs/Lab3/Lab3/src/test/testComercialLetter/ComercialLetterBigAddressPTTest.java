package test.testComercialLetter;

import CreationalPatterns.ComercialLetter.ComercialLetterBigAddressPT;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class ComercialLetterBigAddressPTTest {
    private Data dataCLPT;
	
	@Before
	public void setUp() {
		dataCLPT = SetupDataAndExpectations.mockDataBigAddress();
	}
	
	@Test
	public void testIfAnPortugueseComercialLetterReturnsTheDesiredString() {
		ComercialLetterBigAddressPT letterCLPT = new ComercialLetterBigAddressPT(dataCLPT);
		String desiredString = "31/02/2019\n\nde: Curso Fundamental\nCéu, número 999\npara: Curso Profissional\nInferno, número 666\n\n"
							+ "Prezado(a) Senhor da morte Curso Profissional,\n\n"
							+ "Sinceramente,\n"
							+ "\n\n"
							+ "Curso Fundamental\n"
							+ "telefone: (12) 3333-3999\n"
							+ "email: fundamental@ita.br";
		assertEquals(desiredString, letterCLPT.model());
	}
}