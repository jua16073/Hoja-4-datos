
/**
 * @author Rodrigo Juarez Jui 16073
 * @author Michelle Bloomfield Fong 16803
 *
 */

public interface iPila<E>{
	
	/**
	 * @param algo
	 */
	public void push(E algo);
	
	/**
	 * @return
	 */
	public E pop();
	
	/**
	 * @return
	 */
	public boolean isEmpty();
	
}