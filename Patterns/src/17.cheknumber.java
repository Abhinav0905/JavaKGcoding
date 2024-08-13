import java.util.Scanner;

class cheknumber {
	public static void main(String[] args) {
		System.out.println("Wlcome to number check program " );
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		if (n1>0) {
			System.out.println("The entered number is a Positive number " + n1);
		}
		else if (n1<0){
			System.out.println("The entered number is a Negative number " + n1);
		}
		else {
			System.out.println("The entered number is a Zero " + n1);
		}
	}
}
