
public class Factory {
	
	
	public iPila factory(int dec){
		switch (dec){
		case 3:
			return new SinglyLinkedList();
		case 4:
			return new DoublyLinkedList();
		case 5:
			return new CircularList();
		case 1:
			return new StackVector();
		case 2:
			return new StackArrayList();
		}
		return null;
	}
}
