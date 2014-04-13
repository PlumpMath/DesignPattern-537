package Singleton;

import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;

import sun.nio.cs.SingleByte;

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
				testheadlist.add(th);
				Thread.sleep(1000);
			}	
		}catch(Exception e){
			
		}		
	}
	
	public void startCheck(){
		for(int i=0;i<10;i++){
			System.out.println("thread("+i+"):"+testheadlist.get(i)+"¥n");
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
