package CreationalPatterns.ComercialLetter;

import CreationalPatterns.Data;
import CreationalPatterns.Letter;

public class ComercialLetterBigAddressPT extends Letter {
	
	public ComercialLetterBigAddressPT(Data manager) {
		data_ = manager;
	}
	
	@Override
	public String header() {
		return data_.getDate().getDay()+ "/" + data_.getDate().getMonth()+ "/" + data_.getDate().getYear()+ "\n\n"
				+ "de: " + data_.getSender().getName() + "\n" + data_.getSender().getBigAddress() + "\n"
				+ "para: " + data_.getReceiver().getName() + "\n" + data_.getReceiver().getBigAddress() + "\n\n";
	}
	
	@Override
	public String body() {
		return "Prezado(a) " + data_.getReceiver().getPronoun() + " " + data_.getReceiver().getName() + ",\n\n";
	}
	
	@Override
	public String conclusion() {
		return "Sinceramente,\n";
	}
	
	@Override
	public String signature() {
		return "\n\n"
				+ data_.getSender().getName() + "\n"
				+ "telefone: " +data_.getSender().getPhone() + "\n"
				+ "email: " + data_.getSender().getEmail();
	}
}
