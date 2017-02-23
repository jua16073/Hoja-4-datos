public class DoublyLinkedList<E> implements iPila<E>{
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	public DoublyLinkedList()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}


	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
	   // construct a new element, making it head
	   head = new DoublyLinkedNode<E>(value, head, null);
	   // fix tail, if necessary
	   if (tail == null) tail = head;
	   count++;
	}
	
	public E pop(){
		DoublyLinkedNode <E> x= head;
		if (head.nextElement!=null)
		head=head.nextElement;
		count--;
		return x.value();
	}
	
	public E getFirst(){
		return (E)head;
	}


	public void push(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	   // construct new element
	   tail = new DoublyLinkedNode<E>(value, null, tail);
	   // fix up head
	   if (head == null) head = tail;
	   count++;
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return count==0;
	}
	
}

