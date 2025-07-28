package food.delivery;

import java.util.ArrayList;
import java.util.List;

public abstract class Dish {
	 protected String name;
	    protected double basePrice;
	    protected final List<DishAddOn> addOns;

	    public Dish(String name, double price, List<DishAddOn> addOns) {
	        this.name = name;
	        this.basePrice = price;
	        this.addOns = addOns;
	    }

	    public double getTotalPrice() {
	        return basePrice + addOns.stream().mapToDouble(DishAddOn::getPrice).sum();
	    }

	    public abstract void prepare();
	    public abstract void serve();    
}

