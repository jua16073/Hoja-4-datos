
public class Factory {
	
	public iPila factory(int dec){
		if (dec==1){
			return new StackVector();
		}
		else return new StackArrayList();
	}
}
