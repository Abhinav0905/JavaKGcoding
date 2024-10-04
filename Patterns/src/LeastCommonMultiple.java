import java.sql.SQLOutput;
import java.util.Scanner;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		System.out.println("Least Common Multiple");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		int lcm = lcm(num1 , num2);
		System.out.println("The Least Common Multiple of " + num1 + " and " + num2 + " is " + lcm);
	}

	public static int lcm(int num1 , int num2) {
		int i = 1;
		while(true) {
			int factor = num1 * i;
			if (factor % num2 ==0) {
				return factor;
			}
			i++;
		}
	}
}
