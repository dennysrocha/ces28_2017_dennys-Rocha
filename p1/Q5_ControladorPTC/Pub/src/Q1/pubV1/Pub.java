package Q1.pubV1;

import java.util.*;

import Q1.pubV0.Drink;

public class Pub {
	
    public int price;
    public Drink hansa = new Drink(74, "hansa");
    public Drink grans = new Drink(103, "grans");
    public Drink strongbow = new Drink(110, "strongbow");
    private Drink gt = new Drink(115, "gt");
    private Drink bacardi_special = new Drink(170, "bacardi_special");
    
    private LinkedHashMap<Integer, String> drinks = new LinkedHashMap<Integer, String>();
    
    public Pub() {
    	addDrink(hansa.getPrice(),hansa.getName());
    	addDrink(grans.getPrice(),grans.getName());
    	addDrink(strongbow.getPrice(),strongbow.getName());
    	addDrink(gt.getPrice(),gt.getName());
    	addDrink(bacardi_special.getPrice(),bacardi_special.getName());
    }
    
    public void addDrink(int preco, String nome){
    	drinks.put(preco, nome);
    }
    
    public int computeCost(String drink, boolean student, int amount) {
    
    	if (amount > 2 && (drink.equals("gt") || drink.equals("bacardi_special"))) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
    	if(!drinks.containsValue(drink)){
    		throw new RuntimeException("No such drink exists");
    	}       
    	for(int i : drinks.keySet()){
    		if(drinks.get(i).equals(drink)){
    			price = i;
    		}
    	}
        if (student && (drink.equals("grans") || drink.equals("hansa") || drink.equals("strongbow"))) {
            price = price - price/10;
        }
        return price*amount;
    }
    
}
