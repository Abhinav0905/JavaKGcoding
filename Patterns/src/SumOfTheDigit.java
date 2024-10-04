import java.util.Scanner;
public class SumOfTheDigit {
	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		sumOfTheDigit(num);
		//System.out.println("The sum of  the digit of " + num + "is" + sum );

	}
	public static void sumOfTheDigit(int num){
		int sum = 0;
		while(num > 0){
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("The sum of  the digit of " + num + " is " + sum );
	}
}
