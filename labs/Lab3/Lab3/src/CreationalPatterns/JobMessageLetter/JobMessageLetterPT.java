package CreationalPatterns.JobMessageLetter;

import CreationalPatterns.Data;
import CreationalPatterns.Letter;

public class JobMessageLetterPT extends Letter{
    
    public JobMessageLetterPT(Data manager) {
        data_ = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return 	"para: " + data_.getReceiver().getName()
        		+ "\nemail: " + data_.getReceiver().getEmail()
        		+ "\n" + data_.getDate().getMonth()+ "-" + data_.getDate().getDay()+ "-" + data_.getDate().getYear()
        		+ "\nassunto: " + data_.getSubjectMatter() + "\n"
        		+ "\n";
    }
    
    @Override
    public String body() {
    	return "Olá " + data_.getReceiver().getPronoun() + " " + data_.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Abraços,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + data_.getSender().getName();
    }
}