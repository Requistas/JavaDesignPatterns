package abstractFactory;

/**
 * 
 */
public class FactoryProducer {

    /**
     * Default constructor
     */
    public FactoryProducer() {
    }


    /**
     * @param factory
     */
    public static AbstractFactory getFactory(AllObjects type) {
    	AbstractFactory factory = null;
        if(type.equals(AllObjects.SHAPE)) {
        	factory = new ShapeFactory();
        }else {
        	factory = new ColorFactory();
        }
        return factory;
    }

}