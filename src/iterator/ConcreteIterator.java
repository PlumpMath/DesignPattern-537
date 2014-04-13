package iterator;

public class ConcreteIterator implements Iterator{
	private ConcreteAggregate concreteAggregate;
	private int index = 0;
	
	public void decIterator(){
		index--;
	}
	
	public void incIterator(){
		index++;
	}
	
	public ConcreteIterator(ConcreteAggregate concreteAggregate){
		this.concreteAggregate = concreteAggregate;
	}
	
	public boolean hasNext(){
		if (index >= 0 && index < concreteAggregate.getSize()) {
            return true;
        } else {
            return false;
        }
	}
	
	public boolean hasPrevious(){
		if(index <= concreteAggregate.getSize() && index >= 0){
			return true;
		}else {
			return false;
		}
	}
	
	public Object previous(){
		return concreteAggregate.getItemAt(index--);
	}
	
	public Object next() {
        return concreteAggregate.getItemAt(index++);
    }
}
