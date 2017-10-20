package test.testJobMessageLetter;

import CreationalPatterns.*;
import CreationalPatterns.JobMessageLetter.JobMessageLetterPT;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class JobMessageLetterPTTest {
	private Data dataJMLPT;
	
	@Before
	public void setUp() {
		dataJMLPT = SetupDataAndExpectations.mockData();
	}
	
	@Test
	public void testIfAnPortugueseJobMessageLetterReturnsTheDesiredString() {
		JobMessageLetterPT letterJMLPT = new JobMessageLetterPT(dataJMLPT);
		String desiredString = 	"para: Curso Profissional"
							+ "\nemail: profissional@ita.br"
							+ "\n02-31-2019"
							+ "\nassunto: Vou te desligar!"
							+ "\n\n"
							+ "Olá Senhor da morte Curso Profissional,\n\n"
							+ "Abraços,\n"
							+ "\nCurso Fundamental";
		assertEquals(desiredString, letterJMLPT.model());
	}
}