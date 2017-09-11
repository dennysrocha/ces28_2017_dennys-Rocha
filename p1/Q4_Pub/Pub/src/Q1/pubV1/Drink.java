package Q1.pubV1;

public class Drink {
	public int price;
	public String name;
    
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
