package test.testFriendlyLetter;

import CreationalPatterns.FriendlyLetter.FriendlyLetterPT;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class FriendlyLetterPTTest {
	private Data dataFLPT;
	
	@Before
	public void setUp() {
		dataFLPT = SetupDataAndExpectations.mockData();
	}
	
	@Test
	public void testIfAnPortugueseFriendlyLetterReturnsTheDesiredString() {
		FriendlyLetterPT letterFLPT = new FriendlyLetterPT(dataFLPT);
		String desiredString = "de: Curso Fundamental, Céu, número 999\npara: Curso Profissional, Inferno, número 666\n\n"
							+ "Olá Curso Profissional,\n\n"
							+ "Até mais,\n"
							+ "\n" 
							+ "Curso Fundamental";
		assertEquals(desiredString, letterFLPT.model());
	}
}