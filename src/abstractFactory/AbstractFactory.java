package abstractFactory;


/**
 * 
 */
public abstract class AbstractFactory {

    /**
     * Default constructor
     */
    public AbstractFactory() {
    }

    /**
     * @param color
     */
    public abstract Color getColor(AllObjects color);

    /**
     * @param shape
     */
    public abstract Shape getShape(AllObjects color);

}