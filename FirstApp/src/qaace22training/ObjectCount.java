package qaace22training;

@SuppressWarnings("serial")
class MaxLimitReached extends Exception{
	public MaxLimitReached(String s) {
		super(s);
	}
}
public class ObjectCount {

	static int count;
	public ObjectCount()   
	{ 
		count++;  
	} 
	static void validate(int count) throws MaxLimitReached{
		if(count>3) {
			throw new MaxLimitReached("More Than Three Cannot Be Created");
		}
		else {
			System.out.println("Total Number of Objects:" + count);
		}
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ObjectCount ob1 = new ObjectCount();  
		ObjectCount ob2 = new ObjectCount();  
		ObjectCount ob3 = new ObjectCount();
		ObjectCount ob4 = new ObjectCount();
		try {
			validate(count);
		}
		catch(MaxLimitReached ex) {
			System.out.println(ex);
		}
	}
}