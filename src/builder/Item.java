package builder;

/**
 * 
 */
public abstract class Item {

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * 
     */
    private double cost;


    /**
     * 
     */
    private Packaging packaging;


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public Packaging getPackaging() {
		return packaging;
	}


	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

}