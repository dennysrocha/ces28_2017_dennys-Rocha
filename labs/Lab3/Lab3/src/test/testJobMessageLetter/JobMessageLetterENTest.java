package test.testJobMessageLetter;

import CreationalPatterns.*;
import CreationalPatterns.JobMessageLetter.JobMessageLetterEN;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class JobMessageLetterENTest {
	private Data dataJMLEN;
	
	@Before
	public void setUp() {
		dataJMLEN = SetupDataAndExpectations.mockData();
	}
	
	@Test
	public void testIfAnEnglishJobMessageLetterReturnsTheDesiredString() {
		JobMessageLetterEN letterJMLEN = new JobMessageLetterEN(dataJMLEN);
		String desiredString = 	"to: Curso Profissional"
							+ "\nemail: profissional@ita.br"
							+ "\n02-31-2019"
							+ "\nsubject matter: Vou te desligar!"
							+ "\n\n"
							+ "Hello Senhor da morte Curso Profissional,\n\n"
							+ "Best regards,\n"
							+ "\nCurso Fundamental";
		assertEquals(desiredString, letterJMLEN.model());
	}
}
