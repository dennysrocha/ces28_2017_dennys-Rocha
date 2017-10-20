package CreationalPatterns.FriendlyLetter;

import CreationalPatterns.Data;
import CreationalPatterns.Letter;

public class FriendlyLetterBigAddressPT extends Letter{
    
    public FriendlyLetterBigAddressPT(Data manager) {
        data_ = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return "de: " + data_.getSender().getName() + ", " + data_.getSender().getBigAddress() + "\n"
                + "para: " + data_.getReceiver().getName() + ", " + data_.getReceiver().getBigAddress() + "\n\n";
    }
    
    @Override
    public String body() {
        return "Olá " + data_.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Até mais,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + data_.getSender().getName();
    }
    
}