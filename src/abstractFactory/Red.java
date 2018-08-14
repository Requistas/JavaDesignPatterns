package abstractFactory;

/**
 * 
 */
public class Red implements Color {

    /**
     * Default constructor
     */
    public Red() {
    }
    
    /**
     * 
     */
    public void getName() {
    	System.out.println("This is a "+AllObjects.RED);
    }

    /**
     * 
     */
    public void fill() {
    	 System.out.println("Inside "+ this.getClass().getSimpleName() + "::"+new Object() {}.getClass().getEnclosingMethod().getName()+" method");
    }

}