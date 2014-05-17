package abstractFactory;

public class PizzaTestDriver {
	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		store.orderPizza("cheeze");
	}
}
