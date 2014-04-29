package factoryMethod;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheeze":
			return new NYStyleCheezePizza();
//		case "vegitable":
//			return new NYStyleVeggiePizza();
//		case ...
		default:
			throw new AssertionError();
		}
	}

}
