package decorator;

public class Main {

	public static void main(String[] args) {
		Icecream vanilla = new VanillaIcecream();
		Icecream greenTea = new GreenTeaIcecream();
		
		Icecream ice = new CashewNutsToppingIcecream(vanilla);
		Icecream ice2 = new CashewNutsToppingIcecream(greenTea);
		
		System.out.println(ice.getName());
		System.out.println(ice.howSweet());
		
		System.out.println(ice2.getName());
		System.out.println(ice2.howSweet());
	}

}
