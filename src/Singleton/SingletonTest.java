package Singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void dameSingletonTest() {
		DameSingleton instance1 = DameSingleton.getInstance();
		DameSingleton instance2 = DameSingleton.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
	}

	@Test
	public void ngTest() {
		new Thread() {
			public void run() {
				DameSingleton instance = DameSingleton.getInstance();
				System.out.println(instance);
			}
		}.start();

		new Thread() {
			public void run() {
				DameSingleton instance = DameSingleton.getInstance();
				System.out.println(instance);
			}
		}.start();
	}

}
