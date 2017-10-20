package CreationalPatterns;

import CreationalPatterns.ComercialLetter.ComercialLetterEN;
import CreationalPatterns.ComercialLetter.ComercialLetterPT;
import CreationalPatterns.FriendlyLetter.FriendlyLetterEN;
import CreationalPatterns.FriendlyLetter.FriendlyLetterPT;
import CreationalPatterns.JobMessageLetter.JobMessageLetterEN;
import CreationalPatterns.JobMessageLetter.JobMessageLetterPT;

public class Director {
	private Data data_;
	
	public Director(Data data_) {
		this.data_ = data_;
	}
	
	public String getComercialLetter(String idiom_) throws IllegalArgumentException {
		if (idiom_.equals("english")) {
			ComercialLetterEN comercialLetter = new ComercialLetterEN(data_);
			return comercialLetter.model();
		}
		else if (idiom_.equals("portuguese")) {
			ComercialLetterPT comercialLetter = new ComercialLetterPT(data_);
			return comercialLetter.model();
		}
		else throw new IllegalArgumentException("You can only choose english or portuguese as idiom");
	}
	
	public String getFriendlyLetter(String idiom_) throws IllegalArgumentException {
		if (idiom_.equals("english")) {
			FriendlyLetterEN friendlyLetter = new FriendlyLetterEN(data_);
			return friendlyLetter.model();
		}
		else if (idiom_.equals("portuguese")) {
			FriendlyLetterPT friendlyLetter = new FriendlyLetterPT(data_);
			return friendlyLetter.model();
		}
		else throw new IllegalArgumentException("You can only choose english or portuguese as language");
	}
	
	public String getJobMessageLetter(String idiom_) throws IllegalArgumentException {
		if (idiom_.equals("english")) {
			JobMessageLetterEN jobMessageLetter = new JobMessageLetterEN(data_);
			return jobMessageLetter.model();
		}
		else if (idiom_.equals("portuguese")) {
			JobMessageLetterPT jobMessageLetter = new JobMessageLetterPT(data_);
			return jobMessageLetter.model();
		}
		else throw new IllegalArgumentException("You can only choose english or portuguese as idiom");
	}
}