package CreationalPatterns.FriendlyLetter;

import CreationalPatterns.Data;
import CreationalPatterns.Letter;

public class FriendlyLetterBigAddressEN extends Letter{
    
    public FriendlyLetterBigAddressEN(Data manager) {
        data_ = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return 	"from: " + data_.getSender().getName() + ", " + data_.getSender().getBigAddress() + "\n"
                + "to: " + data_.getReceiver().getName() + ", " + data_.getReceiver().getBigAddress() + "\n\n";
    }
    
    @Override
    public String body() {
        return "Hello " + data_.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "See ya,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + data_.getSender().getName();
    }
}