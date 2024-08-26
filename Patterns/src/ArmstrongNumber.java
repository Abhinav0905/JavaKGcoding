import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Is " + num + " an Armstrong number? " + isArmstrong(num));
	}

	public static boolean isArmstrong(int num) {
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int remainder = temp % 10;
			sum += Math.pow(remainder, 3);
			temp /= 10;
		}
		return sum == num;
	}
}
