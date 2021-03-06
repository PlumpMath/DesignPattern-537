package iterator;

public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
	
	public abstract boolean hasPrevious();
	public abstract Object previous();
	public abstract void decIterator();
	public abstract void incIterator();
}
