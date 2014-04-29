package builder;

public class Main {

	public static void main(String[] args) {
		Director japaneseHouseDirector = new Director(
				new JapaneseHouseBuilder());
		Director kamakuraDirector = new Director(new KamakuraBuilder());

		Building japaneseHouse = japaneseHouseDirector.construct();
		Building kamakura = kamakuraDirector.construct();

		System.out.println(japaneseHouse);
		System.out.println(kamakura);
	}

}
