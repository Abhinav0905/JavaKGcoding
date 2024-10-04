import java.util.Scanner;
class CompoundInterest {
	public static void main(String[] args) {
		System.out.println("WElcome to the Compound Interest Calculator");
		System.out.println("Enter the principal amount ");
		Scanner input = new Scanner(System.in);
		float p = input.nextFloat();
		System.out.println("Enter the rate of intrest ");
		float r = input.nextFloat();
		System.out.println("Enter the time ");
		float t = input.nextFloat();

		float ci = (float) (p * Math.pow((1 * r/100),t));

		System.out.println("The compound intrest is " + ci);
	}
}
