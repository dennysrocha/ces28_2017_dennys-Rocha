package test.testFriendlyLetter;

import CreationalPatterns.FriendlyLetter.FriendlyLetterEN;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class FriendlyLetterENTest {
	private Data dataFLEN;
	
	@Before
	public void setUp() {
		dataFLEN = SetupDataAndExpectations.mockData();
	}
	
	@Test
	public void testIfAnEnglishFriendlyLetterReturnsTheDesiredString() {
		FriendlyLetterEN letterFLEN = new FriendlyLetterEN(dataFLEN);
		String desiredString = "from: Curso Fundamental, Céu, número 999\nto: Curso Profissional, Inferno, número 666\n\n"
							+ "Hello Curso Profissional,\n\n"
							+ "See ya,\n"
							+ "\n" 
							+ "Curso Fundamental";
		assertEquals(desiredString, letterFLEN.model());
	}
}
