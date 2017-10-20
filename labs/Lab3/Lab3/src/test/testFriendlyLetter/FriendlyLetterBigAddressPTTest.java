package test.testFriendlyLetter;

import CreationalPatterns.FriendlyLetter.FriendlyLetterBigAddressPT;
import CreationalPatterns.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import test.SetupDataAndExpectations;

public class FriendlyLetterBigAddressPTTest {
	private Data dataFLPT;
	
	@Before
	public void setUp() {
		dataFLPT = SetupDataAndExpectations.mockDataBigAddress();
	}
	
	@Test
	public void testIfAnPortugueseFriendlyLetterReturnsTheDesiredString() {
		FriendlyLetterBigAddressPT letterFLPT = new FriendlyLetterBigAddressPT(dataFLPT);
		String desiredString = "de: Curso Fundamental, C�u, n�mero 999\npara: Curso Profissional, Inferno, n�mero 666\n\n"
							+ "Ol� Curso Profissional,\n\n"
							+ "At� mais,\n"
							+ "\n" 
							+ "Curso Fundamental";
		assertEquals(desiredString, letterFLPT.model());
	}
}