package builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// Instanciation builder
		MealBuilder builder = new MealBuilder();
		
		// Génération / Affichage menu veg
		Meal vegMeal = builder.prepareVegMeal().build();
		System.out.println("Veg menu : ");
		vegMeal.displayMeal();
		
		// Génération / Affichage menu non veg
		Meal nonVegMeal = builder.prepareNonVegMeal().build();
		System.out.println("Non Veg menu : ");
		nonVegMeal.displayMeal();
		
		// Génération / Affichage menu custom
		MealBuilder customMealBuilder = new MealBuilder();
		Meal customMeal = customMealBuilder
			.addItem(new Coke())
			.addItem(new VegBurger())
			.addItem(new ChickenBurger())
			.addItem(new ToyCar())
			.addItem(new Pepsi())
			.build();
		System.out.println("Custom menu : ");
		customMeal.displayMeal();
	}

}
