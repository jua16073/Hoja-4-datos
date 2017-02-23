
public class CircularList<E> implements iPila<E>{
	protected Node<E> tail; 
	protected int count;

	public CircularList()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}

	public void addFirst(E value)
	// pre: value non-null
	// post: adds element to head of list
	{
	   Node<E> temp = new Node<E>(value);
	   if (tail == null) { // first value added
	       tail = temp;
	       tail.setNext(tail);
	   } else { // element exists in list
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   count++;
	}
	
	public E pop(){
		Node<E> x= tail.nextElement;
		tail= tail.nextElement;
		count--;
		return x.value();
	}


	public void push(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}


	// lo dificil es quitar el elemento de la cola

	public E removeLast()
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
	   Node<E> finger = tail;
	   while (finger.next() != tail) {
	       finger = finger.next();
	   }
	   // finger now points to second-to-last value
	   Node<E> temp = tail;
	   if (finger == tail)
	   {
	       tail = null;
	   } else {
	       finger.setNext(tail.next());
	       tail = finger;
	   }
	   count--;
	   return temp.value();
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return count==0;
	}

}