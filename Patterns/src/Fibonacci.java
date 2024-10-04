import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms you want to generate: ");
		int num = input.nextInt();
		System.out.println("The Fibonacci number is " + fibonacci(num));
	}

	public static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1 || num == 2) {
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
