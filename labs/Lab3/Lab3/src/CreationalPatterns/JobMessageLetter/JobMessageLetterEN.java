package CreationalPatterns.JobMessageLetter;

import CreationalPatterns.Data;
import CreationalPatterns.Letter;

public class JobMessageLetterEN extends Letter{
    
    public JobMessageLetterEN(Data manager) {
        data_ = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return 	"to: " + data_.getReceiver().getName()
        		+ "\nemail: " + data_.getReceiver().getEmail()
        		+ "\n" + data_.getDate().getMonth()+ "-" + data_.getDate().getDay()+ "-" + data_.getDate().getYear()
        		+ "\nsubject matter: " + data_.getSubjectMatter()
        		+ "\n\n";
    }
    
    @Override
    public String body() {
    	return "Hello " + data_.getReceiver().getPronoun() + " " + data_.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Best regards,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + data_.getSender().getName();
    }
}