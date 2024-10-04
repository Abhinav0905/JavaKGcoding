import java.util.Scanner;

class Temperature {
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Farehnit ");
		Scanner input = new Scanner(System.in);
		float farehnit = input.nextFloat();

		float celcius = ((farehnit-32) * 5/9);


		System.out.println("The temperature in celcius is " + celcius);


	}
}
