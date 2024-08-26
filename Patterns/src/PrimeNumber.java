import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Welcome to Prime Number chacker");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check if it is a prime number: ");
		int num = input.nextInt();
		isprime(num);

	}

	public static boolean isprime(int num) {
		while(true) {
			if (num % 2 == 0) {
				System.out.println("The number " + num + " is not a prime number");
				return false;
			}
			else {
				System.out.println("The number " + num + " is a prime number");
				return true;
			}
		}
	}


}
