package abstractFactory;

/**
 * 
 */
public class Rectangle implements Shape {

    /**
     * Default constructor
     */
    public Rectangle() {
    }

    /**
     * 
     */
    public void getName() {
    	System.out.println("This is a "+AllObjects.RECTANGLE);
    }

    /**
     * 
     */
    public void draw() {
    	 System.out.println("Inside "+ this.getClass().getSimpleName() + "::"+new Object() {}.getClass().getEnclosingMethod().getName()+" method");
    }

}