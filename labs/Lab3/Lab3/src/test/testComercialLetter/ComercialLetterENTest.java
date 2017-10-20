package test.testComercialLetter;

import CreationalPatterns.ComercialLetter.ComercialLetterEN;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class ComercialLetterENTest {
	private Data dataCLEN;
	
	@Before
	public void setUp() {        
		dataCLEN = SetupDataAndExpectations.mockData();
	}
	
	@Test
	public void testIfAnEnglishComercialLetterGenerateTheDesiredString() {
		ComercialLetterEN letterCLEN = new ComercialLetterEN(dataCLEN);
		String desiredString = "02-31-2019\n\nfrom: Curso Fundamental\nCéu, número 999\nto: Curso Profissional\nInferno, número 666\n\n"
							+ "Dear Senhor da morte Curso Profissional,\n\n"
							+ "Sincerely,\n"
							+ "\n\n"
							+ "Curso Fundamental\n"
							+ "phone: (12) 3333-3999\n"
							+ "email: fundamental@ita.br";
		assertEquals(desiredString, letterCLEN.model());
	}
}