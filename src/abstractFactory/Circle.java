package abstractFactory;

/**
 * 
 */
public class Circle implements Shape {

    /**
     * Default constructor
     */
    public Circle() {
    }

    /**
     * 
     */
    public void getName() {
    	System.out.println("This is a "+AllObjects.CIRCLE);
    }

    /**
     * 
     */
    public void draw() {
    	 System.out.println("Inside "+ this.getClass().getSimpleName() + "::"+new Object() {}.getClass().getEnclosingMethod().getName()+" method");
    }

}