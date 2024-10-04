import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
		System.out.println("Please enetr a string to check if its palindrome: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("Is " + str + " a palindrome? " + isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		int i =0;
		int j = str.length() - 1;
		while (i<j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}return true;
	}

}
