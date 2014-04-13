package Singleton;

import java.util.ArrayList;


public class testThreadSingleton {
	int num = 10;
	ArrayList<testThread> testheadlist = new ArrayList<testThread>();
	
	public static void main(String[] args){
		testThreadSingleton ts = new testThreadSingleton();
		ts.startTest();
		System.out.println("test start");
		ts.startCheck();
	}
	
	public void startTest(){
		try{
			for(int i=0;i<num;i++){
				testThread th = new testThread();
				th.run();
				testheadlist.add(th);
				Thread.sleep(1);
			}	
		}catch(Exception e){
			System.out.println(e.toString());
		}		
	}
	
	public void startCheck(){
		for(int i=0;i<10;i++){
			testThread th = testheadlist.get(i);
			System.out.println("thread("+i+"):"+th.getTime()+"¥n");
			th.stop();
		}
	}
	
	public class testThread extends Thread{
		Singleton sl = null;
		public void run(){
			sl = Singleton.getInstance();
		}
		
		public long getTime(){
			return sl.getTime();
		}
	}

}
