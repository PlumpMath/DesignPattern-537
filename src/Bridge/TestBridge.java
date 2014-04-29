package Bridge;

public class TestBridge extends absPrint{
	TimePrint prt = new TimePrint();
	
	public TestBridge(){}
	
	public void print(String str){
		prt.print(str);
	}
}
