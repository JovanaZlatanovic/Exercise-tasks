import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		/*
		 * Write a sum method that sums the values of two forwarded numbers. In the main
		 * program, using this method, calculate the value for X which is according to
		 * the formula: 
		 * x = a + b + c + 2 * d; 
		 *  x = a + b 
		 *  x = x + c
		 * x= x + (2 * d)
		 * int x=sum(sum(2,3),4)+sum(3,3);
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a:");
		int a = s.nextInt();

		System.out.println("Enter b:");
		int b = s.nextInt();

		System.out.println("Enter c:");
		int c = s.nextInt();

		System.out.println("Enter d:");
		int d = s.nextInt();

		int x = sum(sum(a, b), c) + sum(d, d);

		System.out.println("The sum is: " + x);

	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

}