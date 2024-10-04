import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Factorial of a number");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		factorial(number);
	// 	int result = factorial(number);
		// System.out.println("Factorial of " + number + " is " + factorial(number));

	}
	public static void factorial(int number) {
		int i = 2;
		int fact = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}
}
