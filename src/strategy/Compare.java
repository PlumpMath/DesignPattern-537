package strategy;

public class Compare {
	private Comparator comparator = null;
    public Compare(Comparator comparator){
        this.comparator = comparator;
    }
    
    public int compare(Human h1,Human h2){
        return comparator.compare(h1,h2);
    }
}
