package Bridge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimePrint {
	public TimePrint(){};
	
	public void print(String str){
		Date date1 = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss,SSS");
		System.out.println(sdf1.format(date1)+" "+str);
	}
}
