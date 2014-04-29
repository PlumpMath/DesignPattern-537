package Bridge;

public class Printer {
	private PrintImple pri;

	public Printer(PrintImple printImple){
		this.pri = printImple;
	}
	
	public void print(String str){
		pri.print(str);
	}
}
