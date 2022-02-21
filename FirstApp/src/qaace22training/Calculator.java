package qaace22training;

class Addition{
	int c;
	Addition(int a,int b){
		c=a+b;
	}
}

class Sub{
	int c;
	Sub(int a,int b){
		c=a-b;
	}

}

class Mult{
	int c;
	Mult(int a,int b){
		c=a*b;
	}
}

class Div{
	int c;
	Div(int a,int b){
		c=a/b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition(10,5);
		System.out.println("Addition = "+add.c);
		Sub sub = new Sub(10,5);
		System.out.println("Subtraction ="+sub.c);
		Mult mult = new Mult(10,5);
		System.out.println("Multiplication ="+mult.c);
		Div div = new Div(10,5);
		System.out.println("Division ="+div.c);
	}

}
