import java.util.Scanner;

class operators {
	public static void main(String[] args){
		System.out.println("ENter the first number");
		Scanner input  = new Scanner(System.in);
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		/* System.out.println("Enetr the operator");
		char operator = input.next().charAt(0);
		int result = 0; */
		System.out.println("The sum of two given number is "  + (num1 + num2));
		System.out.println("The fifefrence between two given number is  " + (num1 - num2));
		System.out.println("The multiplication between two given number is " + (num1 * num2));
		System.out.println("The division between two given number is " + (num1 / num2));
		System.out.println("The modulus between two given number is " + (num1 % num2));
	}
}
