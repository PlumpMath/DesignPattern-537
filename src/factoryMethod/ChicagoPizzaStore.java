package factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheeze":
			return new ChicagoStyleCheezePizza();
//		case "vegitable":
//			return new ChicagoStyleVeggiePizza();
//		case ...
		default:
			throw new AssertionError();
		}
	}

}
