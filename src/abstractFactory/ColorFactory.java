package abstractFactory;

/**
 * 
 */
public class ColorFactory extends AbstractFactory {

    /**
     * Default constructor
     */
    public ColorFactory() {
    }

    /**
     * @param color
     */
    @Override
    public Color getColor(AllObjects color) {
    	Color colorToReturn = null;
        switch (color) {
		case BLUE:
			colorToReturn = new Blue();
			break;
			
		case RED:
			colorToReturn = new Red();
			break;
			
		case GREEN:
			colorToReturn = new Green();
			break;
			
		default:
			break;
		}
        
        return colorToReturn;
    }

	@Override
	public Shape getShape(AllObjects color) {
		return null;
	}
}