package abstractFactory;

/**
 * 
 */
public class Square implements Shape {

    /**
     * Default constructor
     */
    public Square() {
    }

    /**
     * 
     */
    public void getName() {
    	System.out.println("This is a "+AllObjects.SQUARE);
    }

    /**
     * 
     */
    public void draw() {
    	 System.out.println("Inside "+ this.getClass().getSimpleName() + "::"+new Object() {}.getClass().getEnclosingMethod().getName()+" method");
    }

}