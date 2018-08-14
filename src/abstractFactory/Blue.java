package abstractFactory;

/**
 * 
 */
public class Blue implements Color {

    /**
     * Default constructor
     */
    public Blue() {
    }

    /**
     * 
     */
    public void fill() {
    	 System.out.println("Inside "+ this.getClass().getSimpleName() + "::"+new Object() {}.getClass().getEnclosingMethod().getName()+" method");
    }

    /**
     * 
     */
    public void getName() {
        System.out.println("This is a "+AllObjects.BLUE);
    }

}