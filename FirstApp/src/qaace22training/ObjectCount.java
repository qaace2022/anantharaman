package qaace22training;

public class ObjectCount {
	private static int count;
	public ObjectCount()   
	{ 
	count++;  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCount ob1 = new ObjectCount();  
		ObjectCount ob2 = new ObjectCount();  
		ObjectCount ob3 = new ObjectCount();  
		ObjectCount ob4 = new ObjectCount();  
		ObjectCount ob5 = new ObjectCount();
		ObjectCount ob6 = new ObjectCount();
		ObjectCount ob7 = new ObjectCount();
		ObjectCount ob8 = new ObjectCount();
		ObjectCount ob9 = new ObjectCount();
		ObjectCount ob10 = new ObjectCount();
		ObjectCount ob11 = new ObjectCount();
		  
		System.out.print("Total Number of Objects: " + ObjectCount.count);  

	}

}