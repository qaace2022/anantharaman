package qaace22training;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = String.valueOf(num);
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		num = Integer.parseInt(s1.toString());
		System.out.println(num);
		sc.close();
	}

}
