
/**
 * @author Rodrigo Juarez Jui 16073
 * @author Michelle Bloomfield Fong 16803
 *
 */

import java.util.ArrayList;

public class StackArrayList<E>implements iPila<E>{
	protected ArrayList<E> data;

	public StackArrayList(){
	// post: constructs a new, empty stack
	
		data = new ArrayList<E>();
	}
	

	@Override
	public void push(E algo) {
		// TODO Auto-generated method stub
		data.add(algo);
		
	}
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		
		return data.remove(data.size()-data.size());
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.size()==0;
	}
	
	
}
