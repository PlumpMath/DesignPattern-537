package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate {
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void deleteItemAt(int iIndex){
    	items.remove(iIndex);
    }
    
    public void clearItem(){
    	items.clear();
    }
    
    public int getSize() {
        return items.size();
    }
    public Item getItemAt(int index) {
        return (Item) items.get(index);
    }
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
