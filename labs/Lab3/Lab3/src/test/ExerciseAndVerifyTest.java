package test;

import org.junit.Test;
import CreationalPatterns.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseAndVerifyTest {
	private Data data_;
	private Data dataBigAddress_;
	private Director director_;
	private Director directorBigAddress_;
	
	@Before
	public void exercise(){
		data_ = SetupDataAndExpectations.mockData();
		dataBigAddress_ = SetupDataAndExpectations.mockDataBigAddress();
		director_ = new Director(data_);
		directorBigAddress_ = new Director(dataBigAddress_);
		
	}
	
	
	
	// expectations
	@Test 
	public void testEnglishComercialLetter() {
		String desiredString = 	"02-31-2019\n\n"
							+ "from: Curso Fundamental\nCéu, número 999\n"
							+ "to: Curso Profissional\nInferno, número 666\n\n"
							+ "Dear Senhor da morte Curso Profissional,\n\n"
							+ "Sincerely,\n"
							+ "\n\n"
							+ "Curso Fundamental\n"
							+ "phone: (12) 3333-3999\n"
							+ "email: fundamental@ita.br";
		assertEquals(desiredString, director_.getComercialLetter("english"));
	}
	
	public void testEnglishComercialLetterBigAddress() {
		String desiredString = 	"02-31-2019\n\n"
							+ "from: Curso Fundamental\nCéu, número 999\n"
							+ "to: Curso Profissional\nInferno, número 666\n\n"
							+ "Dear Senhor da morte Curso Profissional,\n\n"
							+ "Sincerely,\n"
							+ "\n\n"
							+ "Curso Fundamental\n"
							+ "phone: (12) 3333-3999\n"
							+ "email: fundamental@ita.br";
		assertEquals(desiredString, directorBigAddress_.getComercialLetter("english"));
	}
	
	@Test
	public void testPortugueseComercialLetter() {
		String desiredString = 	"31/02/2019\n\n"
							+ "de: Curso Fundamental\nCéu, número 999\n"
							+ "para: Curso Profissional\nInferno, número 666\n\n"
							+ "Prezado(a) Senhor da morte Curso Profissional,\n\n"
							+ "Sinceramente,\n"
							+ "\n\n"
							+ "Curso Fundamental\n"
							+ "telefone: (12) 3333-3999\n"
							+ "email: fundamental@ita.br";
		assertEquals(desiredString, director_.getComercialLetter("portuguese"));
    }
	
	@Test
	public void testEnglishFriendlyLetter() {
		String desiredString = 	"from: Curso Fundamental, Céu, número 999\n"
							+ "to: Curso Profissional, Inferno, número 666\n\n"
							+ "Hello Curso Profissional,\n\n"
							+ "See ya,\n"
							+ "\n"
							+ "Curso Fundamental";
		assertEquals(desiredString, director_.getFriendlyLetter("english"));
	}
	
	@Test
	public void testPortugueseFriendlyLetter() {
		String desiredString = 	"de: Curso Fundamental, Céu, número 999\n"
							+ "para: Curso Profissional, Inferno, número 666\n\n"
							+ "Olá Curso Profissional,\n\n"
							+ "Até mais,\n"
							+ "\n"
							+ "Curso Fundamental";
		assertEquals(desiredString, director_.getFriendlyLetter("portuguese"));     
	}
	
	@Test
	public void testEnglishJobMessageLetter() {
		String desiredString = 	"to: Curso Profissional"
							+ "\nemail: profissional@ita.br"
							+ "\n02-31-2019"
							+ "\nsubject matter: Vou te desligar!"
							+ "\n\n"
							+ "Hello Senhor da morte Curso Profissional,\n\n"
							+ "Best regards,\n"
							+ "\nCurso Fundamental";
		assertEquals(desiredString, director_.getJobMessageLetter("english"));
	}
	
	@Test
	public void testPortugueseJobMessageLetter() {
		String desiredString = 	"para: Curso Profissional"
							+ "\nemail: profissional@ita.br"
							+ "\n02-31-2019"
							+ "\nassunto: Vou te desligar!"
							+ "\n\n"
							+ "Olá Senhor da morte Curso Profissional,\n\n"
							+ "Abraços,\n"
							+ "\nCurso Fundamental";
		assertEquals(desiredString, director_.getJobMessageLetter("portuguese"));
	}
}
