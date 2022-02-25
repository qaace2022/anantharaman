package qaace2022training;

public class MOExample {

	public void show(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println("Sum is "+sum);
	}
	public void show(String s) {
		System.out.println("Name : "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOExample o = new MOExample();
		o.show(10,20,30);
		o.show("Anantharaman");
	}
}
