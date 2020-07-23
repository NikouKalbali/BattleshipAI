import java.awt.List;
import java.util.ArrayList;

/**
 * <h1>genericList</h1> 
 * generic list
 * @author Nikou Kalabali
 * @version 1
 */
public class GenericList<T> {
	int MAX_SIZE = 100;
	ArrayList<T> s = new ArrayList();
	//TODO make sure the constructor is called just one time

	
	public void add(int i, T p) throws FullSequenceException, InvalidPositionException{
		if (s.size() == MAX_SIZE) throw new FullSequenceException("FullSequenceException");
		else if (i > MAX_SIZE) throw new InvalidPositionException("InvalidPositionException");
		else s.add(i, p);
	}
	public void del(int i) throws InvalidPositionException{
		if (i >= s.size()) throw new InvalidPositionException("InvalidPositionException");
		else s.remove(i);
		
	}
	public void setval(int i,T p) throws InvalidPositionException{
		if (i >= s.size()) throw new InvalidPositionException("InvalidPositionException");
		else s.set(i, p);
	}
	public T getval(int i) throws InvalidPositionException{
		if (i >= s.size()) throw new InvalidPositionException("InvalidPositionException");
		return s.get(i);
	}
	public int size(){
		return s.size(); //TODO to find item that is full
		
	}



}
