package strategy;

public class DameCompare {
	private static final int COMPARE_AGE = 1;
	private static final int COMPARE_HEIGHT = 2;
		
	private int type = 1;
		
	public DameCompare(int tmpType){
		type = tmpType;
	}
	
	public int testDameCompare(Human h1, Human h2){
		int retnum = 0;
	
		switch (this.type){
		case COMPARE_AGE:
			if (h1.age > h2.age){
				retnum = 1;
			}else if(h1.age == h2.age){
				retnum = 0;
			}else{
				retnum = -1;
			}
			break;
		case COMPARE_HEIGHT: 
			if (h1.height > h2.height){
				retnum = 1;
			}else if(h1.height == h2.height){
				retnum = 0;
			}else{
				retnum = -1;
			}
			break;
		default:
				retnum = -2;
			break;
		}
		return retnum;
	}
}
