package qaace22training;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0)))
		{
		System.out.println(year + " : Leap Year");
		}
		else {
		System.out.println(year + " : Non - Leap Year");
		}
		s.close();
	}
}
