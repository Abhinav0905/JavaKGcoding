import java.util.Scanner;

class product {
	public static void main(String[] args){
		System.out.println("Enter the first number ");
		Scanner input = new Scanner(System.in);
		float num1 = input.nextFloat();
		System.out.println("Enter the second number");
		float num2 = input.nextFloat();

		float num3 = num1 * num2;

		System.out.println("The products of the two number is " + num3);

	}
}
