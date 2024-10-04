import java.util.Scanner;
public class GreatestcommonDivisor {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers to find the GCD");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		gcd(num1 , num2);

	}
	public static int gcd(int num1 , int num2) {
		int i = 1;
		while(true) {
			int factor = num1 * i;
			if (factor % num2 ==0) {
				System.out.println("The GCD of " + num1 + " and " + num2 + " is " + factor);
				return factor;
			}
			i++;
		}
	}
}
