package adapter;

public class Main {

	public static void main(String[] args) {
		// Print somePrint = new SomePrint();
		Print somePrint = new PrintBanner("Lacky☆Star");

		System.out.println("printWeak: ");
		somePrint.printWeak();

		System.out.println("printStrong: ");
		somePrint.printStrong();
	}

}
