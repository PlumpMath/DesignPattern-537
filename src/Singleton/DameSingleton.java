package Singleton;

public class DameSingleton {
	private static DameSingleton instance;
	long time = System.currentTimeMillis();

	private DameSingleton() {
	}

	public static DameSingleton getInstance() {
		DameSingleton singleton;
		if (instance == null) {
			singleton = new DameSingleton();
			instance = singleton;
		} else {
			singleton = instance;
		}
		return singleton;
	}
}
