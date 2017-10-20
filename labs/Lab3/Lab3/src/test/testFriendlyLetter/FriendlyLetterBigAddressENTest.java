package test.testFriendlyLetter;

import CreationalPatterns.FriendlyLetter.FriendlyLetterBigAddressEN;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class FriendlyLetterBigAddressENTest {
	private Data dataFLEN;
	
	@Before
	public void setUp() {
		dataFLEN = SetupDataAndExpectations.mockDataBigAddress();
	}
	
	@Test
	public void testIfAnEnglishFriendlyLetterReturnsTheDesiredString() {
		FriendlyLetterBigAddressEN letterFLEN = new FriendlyLetterBigAddressEN(dataFLEN);
		String desiredString = "from: Curso Fundamental, Céu, número 999\nto: Curso Profissional, Inferno, número 666\n\n"
							+ "Hello Curso Profissional,\n\n"
							+ "See ya,\n"
							+ "\n" 
							+ "Curso Fundamental";
		assertEquals(desiredString, letterFLEN.model());
	}
}
