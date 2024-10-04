import java.util.Scanner;

class SumOfAllOddNumbers {
	public static void main(String[] args) {
		System.out.println("Sum of all odd numbers");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		SumOfAllOddNumbers(num);
	}

	public static void SumOfAllOddNumbers(int num) {
		int i = 1;
		int sum = 0;
		while(i <= num) {
			if (i%2 !=0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum of all odd numbers upto " + num + " is " + sum);
	}
}




