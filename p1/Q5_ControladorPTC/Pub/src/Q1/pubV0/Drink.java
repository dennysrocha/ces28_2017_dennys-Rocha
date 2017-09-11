package Q1.pubV0;

public class Drink {
	int price;
	String name;
    
	public Drink(int price, String name) {
		this.name = name;
		this.price = price;
	}
	
    public int getPrice() {
    	return this.price;
    }

    public void setPrice(int price) {
    	this.price = price;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
}
