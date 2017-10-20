package test;

import CreationalPatterns.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SetupDataAndExpectations {
	
	static public Person mockFund(){
		Person fundMock = mock(Person.class);
		when(fundMock.getName()).thenReturn("Curso Fundamental");
		when(fundMock.getAddress()).thenReturn("Céu, número 999");
		when(fundMock.getPhone()).thenReturn("(12) 3333-3999");
		when(fundMock.getEmail()).thenReturn("fundamental@ita.br");
		when(fundMock.getPronoun()).thenReturn("Senhor da salvação");
		return fundMock;
	}
	
	static public Person mockFundBigAddress(){
		Person fundMock = mock(Person.class);
		when(fundMock.getName()).thenReturn("Curso Fundamental");
		when(fundMock.getBigAddress()).thenReturn("Céu, número 999");
		when(fundMock.getPhone()).thenReturn("(12) 3333-3999");
		when(fundMock.getEmail()).thenReturn("fundamental@ita.br");
		when(fundMock.getPronoun()).thenReturn("Senhor da salvação");
		return fundMock;
	}

	static public Person mockProf(){
		Person profMock = mock(Person.class);
		when(profMock.getName()).thenReturn("Curso Profissional");
		when(profMock.getAddress()).thenReturn("Inferno, número 666");
		when(profMock.getPhone()).thenReturn("(12) 3333-3666");
		when(profMock.getEmail()).thenReturn("profissional@ita.br");
		when(profMock.getPronoun()).thenReturn("Senhor da morte");
		return profMock;
	}
	
	static public Person mockProfBigAddress(){
		Person profMock = mock(Person.class);
		when(profMock.getName()).thenReturn("Curso Profissional");
		when(profMock.getBigAddress()).thenReturn("Inferno, número 666");
		when(profMock.getPhone()).thenReturn("(12) 3333-3666");
		when(profMock.getEmail()).thenReturn("profissional@ita.br");
		when(profMock.getPronoun()).thenReturn("Senhor da morte");
		return profMock;
	}
	
	static public Data mockData(){
		Date dateMock = mock(Date.class);
		when(dateMock.getDay()).thenReturn("31");
		when(dateMock.getMonth()).thenReturn("02");
		when(dateMock.getYear()).thenReturn("2019");
		Data dataMock = mock(Data.class);
		Person senderMock = mockFund();
		Person receiverMock = mockProf();
		when(dataMock.getDate()).thenReturn(dateMock);
		when(dataMock.getSender()).thenReturn(senderMock);
		when(dataMock.getReceiver()).thenReturn(receiverMock);
		when(dataMock.getSubjectMatter()).thenReturn("Vou te desligar!");
        return dataMock;
	}
	
	static public Data mockDataBigAddress(){
		Date dateMock = mock(Date.class);
		when(dateMock.getDay()).thenReturn("31");
		when(dateMock.getMonth()).thenReturn("02");
		when(dateMock.getYear()).thenReturn("2019");
		Data dataMock = mock(Data.class);
		Person senderMock = mockFundBigAddress();
		Person receiverMock = mockProfBigAddress();
		when(dataMock.getDate()).thenReturn(dateMock);
		when(dataMock.getSender()).thenReturn(senderMock);
		when(dataMock.getReceiver()).thenReturn(receiverMock);
		when(dataMock.getSubjectMatter()).thenReturn("Vou te desligar!");
        return dataMock;
	}
}
