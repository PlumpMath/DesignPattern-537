package Singleton;

public class Singleton {
	private static final Singleton instance = new Singleton();
	private long time = System.currentTimeMillis(); 
	
	private Singleton(){		
		
	}
	public static Singleton getInstance(){
		return Singleton.instance;
	}
	
	public long getTime(){
		return time;
	}
}
