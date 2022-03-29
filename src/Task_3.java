
public class Task_3 {

	public static void main(String[] args) {
		/* Write a method that checks if it is through a palindrome. 
		 * A string is a palindrome if the string is read the same on the left and right. 
		 * The method receives the string as a parameter and returns a boolean.
			example of palindrome: string = a, b, c, d, d, c, b, a
			example of non-palindrome: string = a, b, c, x, p, c
*/
		
		String[] array = {"a", "b", "c", "c", "b", "a"};
		System.out.println(palindrome(array));
	}
	
	public static boolean palindrome(String[] niz) {
				
		for (int i = 0; i < niz.length; i++) {
			if (!niz[i].equals(niz[niz.length - 1 - i])) {
				return false;
			}
		}
		
		return true;

	}

}
