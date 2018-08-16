package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class MealBuilder {

    /**
     * Default constructor
     */
    public MealBuilder() {
    	this.items = new ArrayList<Item>();
    }

    /**
     * 
     */
    private List<Item> items;

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
    
    public MealBuilder addItem(Object object) {
    	Item item = (Item)object;
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
    
    public MealBuilder addItem(Item item, int number) throws CloneNotSupportedException {
    	for (int i = 0; i < number; i++) {
			this.addItem(item.clone());
		}
    	return this;
    }

}