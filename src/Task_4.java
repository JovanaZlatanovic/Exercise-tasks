
public class Task_4 {

	public static void main(String[] args) {
		/*Write a method that returns information for the passed string to see if it is a fibonation string.
		The Fibonacci sequence is, as a rule, that the element is the sum of the previous two. 
		These two elements are acceptable
			example of the Fibonacci sequence => 1, 4, 5, 9, 14,
			example of non-Fibonacci sequence => 1, 4, 5, 9, 18,*/

		
		int[] array = { 1, 4, 5, 9, 14 };

		System.out.println(fibonacciSequence(array));

	}

	public static boolean fibonacciSequence(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			int sum = 0;
			sum = array[i - 1] + array[i];
			if (sum != array[i + 1])

				return false;
		}
		return true;
		
	}

}
