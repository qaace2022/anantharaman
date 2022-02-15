package qaace22training;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
	    int num1, num2, result;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, /, or %");
	    operator = s.next().charAt(0);
	    System.out.println("Enter first number");
	    num1 = s.nextInt();
	    System.out.println("Enter second number");
	    num2 = s.nextInt();
	    switch (operator) {
	      case '+':
	    	  	result = num1 + num2;
	    	  	System.out.println(num1 + " + " + num2 + " = " + result);
	        break;
	      case '-':
	    	  	result = num1 - num2;
	    	  	System.out.println(num1 + " - " + num2 + " = " + result);
	        break;
	      case '*':
	    	  	result = num1 * num2;
	    	  	System.out.println(num1 + " * " + num2 + " = " + result);
	        break;        
	      case '/':
	    	  	result = num1 / num2;
	    	  	System.out.println(num1 + " / " + num2 + " = " + result);
	        break;
	      case '%':
		        result = num1 % num2;
		        System.out.println(num1 + " % " + num2 + " = " + result);
		        break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    s.close();
	}
}
