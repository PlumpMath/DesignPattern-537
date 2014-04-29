package prototype;
import java.util.*;

public class Keeper{
    private Map<String,Cloneable> map;
    public Keeper(){
        this.map = new HashMap<String,Cloneable> ();
    }
    public void addCloneable(String key,Cloneable prototype){
        map.put( key , prototype );
    }
    public Cloneable getClone(String key){
        Cloneable prototype = map.get(key);
        return prototype.createClone();
    }
}
