package builder;

import java.util.Set;

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
    private Set<Item> items;
    
    

    public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	/**
     * @return
     */
    public double getCost() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * 
     */
    public void displayMeal() {
    	int totalCost = 0;
        for (Item item : items) {
			System.out.println("Item : " + item.getClass().getSimpleName() + ", Packaging : " + item.getPackaging().getClass().getSimpleName() + ", price : " + item.getCost());
			totalCost += item.getCost();
        }
        System.out.println("Total cost : " + totalCost + System.lineSeparator());
        
    }

}