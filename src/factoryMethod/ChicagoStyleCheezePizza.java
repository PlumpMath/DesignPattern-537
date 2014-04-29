package factoryMethod;

public class ChicagoStyleCheezePizza extends Pizza {
	public ChicagoStyleCheezePizza() {
		name = "Chicago Style Cheeze Pizza";
	}
	
	@Override
	void cut() {
		System.out.println("四角に切る");
	}
}
