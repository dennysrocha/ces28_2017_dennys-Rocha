package test.testComercialLetter;

import CreationalPatterns.ComercialLetter.ComercialLetterBigAddressEN;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class ComercialLetterBigAddressENTest {
	private Data dataCLEN;
	
	@Before
	public void setUp() {        
		dataCLEN = SetupDataAndExpectations.mockDataBigAddress();
	}
	
	@Test
	public void testIfAnEnglishComercialLetterGenerateTheDesiredString() {
		ComercialLetterBigAddressEN letterCLEN = new ComercialLetterBigAddressEN(dataCLEN);
		String desiredString = "02-31-2019\n\nfrom: Curso Fundamental\nC�u, n�mero 999\nto: Curso Profissional\nInferno, n�mero 666\n\n"
							+ "Dear Senhor da morte Curso Profissional,\n\n"
							+ "Sincerely,\n"
							+ "\n\n"
							+ "Curso Fundamental\n"
							+ "phone: (12) 3333-3999\n"
							+ "email: fundamental@ita.br";
		assertEquals(desiredString, letterCLEN.model());
	}
}