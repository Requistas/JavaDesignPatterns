package abstractFactory;


public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(AllObjects.SHAPE);
		
		// get an object of shape Circle
		Shape shape1 = shapeFactory.getShape(AllObjects.CIRCLE);
		
		// call draw method of shape Circle
		shape1.draw();
		
		// get an object of shape Rectangle
		Shape shape2 = shapeFactory.getShape(AllObjects.RECTANGLE);
		
		// call draw method of shape Rectangle
		shape2.draw();
		
		// get an object of shape Square
		Shape shape3 = shapeFactory.getShape(AllObjects.SQUARE);
		
		// call draw method of shape Square
		shape3.draw();
		
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory(AllObjects.COLOR);
		
		// get an object of color Blue
		Color color1 = colorFactory.getColor(AllObjects.BLUE);
		
		// call fill method of color Blue
		color1.fill();
		
		// get an object of color Red
		Color color2 = colorFactory.getColor(AllObjects.RED);
		
		// call fill method of color Red
		color2.fill();
		
		// get an object of color Green
		Color color3 = colorFactory.getColor(AllObjects.GREEN);
		
		// call fill method of color Green
		color3.fill();
		
		// get name of shapes : 
		shape1.getName();
		shape2.getName();
		shape3.getName();
		
		// get name of colors : 
		color1.getName();
		color2.getName();
		color3.getName();
	}

}
