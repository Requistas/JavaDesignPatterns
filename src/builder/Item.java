package builder;

/**
 * 
 */
public abstract class Item implements Cloneable {

    /**
     * Default constructor
     */
    public Item() {
    }

    private double cost;

    private Packaging packaging;
    
    private String name;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}