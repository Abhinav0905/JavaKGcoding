import java.util.Scanner;

class SimpleInterest {
	public static void main(String[] args) {
		System.out.println("Enter the principal amount ");
		Scanner input = new Scanner(System.in);
		float p = input.nextFloat();
		System.out.println("Enter the rate of intrest ");
		float r = input.nextFloat();
		System.out.println("Enter the time ");
		int t = input.nextInt();

		float si = (p * r * t) / 100;

		System.out.println("The simple intrest is " + si);
	}
}
