package builder;

import java.util.List;

/**
 * 
 */
public class Meal {

    /**
     * Default constructor
     */
    public Meal() {
    }

    /**
     * 
     */
    private List<Item> items;

    public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
     * @return
     */
    public double getCost() {
    	int cost = 0;
    	
    	for (Item item : items) {
    		cost += item.getCost();
    	}
    	return cost;
    }

    /**
     * 
     */
    public void displayMeal() {
    	
        for (Item item : items) {
			System.out.println("Item : " + item.getName() + ", Packaging : " + item.getPackaging().getClass().getSimpleName() + ", price : " + item.getCost());
			
        }
        System.out.println("Total cost : " + getCost() + System.lineSeparator());
        
    }

}