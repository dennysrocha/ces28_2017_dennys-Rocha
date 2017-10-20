package CreationalPatterns;

public abstract class Letter{
	protected Data data_; // a ser usado nas cartas de diferentes linguas
    
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    public abstract String header();
    
    public abstract String body();
    
    public abstract String conclusion();
    
    public abstract String signature();    
}
