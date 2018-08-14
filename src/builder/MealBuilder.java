package builder;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class MealBuilder {

    /**
     * Default constructor
     */
    public MealBuilder() {
    	this.items = new HashSet<Item>();
    }

    /**
     * 
     */
    private Set<Item> items;

    /**
     * 
     */
    public MealBuilder prepareVegMeal() {
    	this.items.clear();
        this.addItem(new Pepsi());
        this.addItem(new VegBurger());
        return this;
    }

    /**
     * 
     */
    public MealBuilder prepareNonVegMeal() {
    	this.items.clear();
    	this.addItem(new Coke());
        this.addItem(new ChickenBurger());
        return this;
    }


    /**
     * 
     */
    public Meal build() {
        Meal meal = new Meal();
        meal.setItems(this.items);
        return meal;
    }
    
    public MealBuilder addItem(Item item) {
    	if(item instanceof Burger) {
    		item.setPackaging(new Wrapper());
    		if(item instanceof VegBurger) {
    			item.setCost(35);
    		}else {
    			item.setCost(30);
    		}
    	} else if(item instanceof Drink) {
    		item.setPackaging(new Bottle());
    		item.setCost(20);
    	} else if(item instanceof Game){
    		item.setPackaging(new PlasticFilm());
    		item.setCost(5);
    	} else {
    		item = null;
    	}
    	this.items.add(item);
    	return this;
    }

}