package abstractFactory;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
	    PizzaIngredientFactory ingredientFactory 
	        = new NYPizzaIngredientFactory();
		switch (type) {
		case "cheeze":
			return new CheezePizza(ingredientFactory);
//		case "vegitable":
//			return new NYStyleVeggiePizza();
//		case ...
		default:
			throw new AssertionError();
		}
	}

}
