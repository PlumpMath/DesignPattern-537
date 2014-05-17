package abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

//    PizzaIngredientFactory ingredientFactory
//        = new ChicagoPizzaIngredientFactory();
	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheeze":
//			return new CheezePizza(ingredientFactory);
//		case "vegitable":
//			return new ChicagoStyleVeggiePizza();
//		case ...
		default:
			throw new AssertionError();
		}
	}

}
