package abstractFactory;

/**
 * 
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * Default constructor
     */
    public ShapeFactory() {
    }

    /**
     * @param shape
     */
    @Override
    public Shape getShape(AllObjects shape) {
    	Shape shapeToReturn = null;
        switch (shape) {
		case CIRCLE:
			shapeToReturn = new Circle();
			break;
			
		case RECTANGLE:
			shapeToReturn = new Rectangle();
			break;
			
		case SQUARE:
			shapeToReturn = new Square();
			break;
			
		default:
			break;
		}
        
        return shapeToReturn;
    }
    

	@Override
	public Color getColor(AllObjects color) {
		return null;
	}

}