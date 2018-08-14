package abstractFactory;

/**
 * 
 */
public class Green implements Color {

    /**
     * Default constructor
     */
    public Green() {
    }


    /**
     * 
     */
    public void getName() {
    	System.out.println("This is a "+AllObjects.GREEN);
    }

    /**
     * 
     */
    public void fill() {
    	System.out.println("Inside "+ this.getClass().getSimpleName() + "::"+new Object() {}.getClass().getEnclosingMethod().getName()+" method");
    }

}