package qaace22training;

import java.util.Scanner;

public class PermutationCombination {
	static int factorial(int n) {
		int fact = 1;
		int i = 1;
		while(i <= n) {
			fact *= i;
			i++;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r, combination, perumutation;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of n : ");
		n = s.nextInt();
		System.out.print("Enter Value of r : ");
		r = s.nextInt();
		perumutation = factorial(n) / factorial(n-r);
		System.out.println("Permutation: " + perumutation);
		combination = factorial(n) / (factorial(r) * factorial(n-r));
		System.out.println("Combination: " + combination);
		s.close();
	}
}
