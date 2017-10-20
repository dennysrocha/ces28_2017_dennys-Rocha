package CreationalPatterns.ComercialLetter;

import CreationalPatterns.Data;
import CreationalPatterns.Letter;

public class ComercialLetterBigAddressEN extends Letter {
	
	public ComercialLetterBigAddressEN(Data manager) {
		data_ = manager;
	}
	    
	@Override
	public String header() {
		return 	data_.getDate().getMonth() + "-" + data_.getDate().getDay() + "-" + data_.getDate().getYear() + "\n\n"
				+ "from: " + data_.getSender().getName() + "\n" + data_.getSender().getBigAddress() + "\n"
				+ "to: " + data_.getReceiver().getName() + "\n" + data_.getReceiver().getBigAddress() + "\n\n";
	}
	
	@Override
	public String body() {
		return "Dear " + data_.getReceiver().getPronoun() + " " + data_.getReceiver().getName() + ",\n\n";
	}
	
	@Override
	public String conclusion() {
		return "Sincerely,\n";
	}
	
	@Override
	public String signature() {
		return "\n\n"
				+ data_.getSender().getName() + "\n"
				+ "phone: " + data_.getSender().getPhone() + "\n"
				+ "email: " + data_.getSender().getEmail();
	}
}
