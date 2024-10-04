import java.util.Scanner;

class Multipicationtable {
	public static void main(String[] args) {
		System.out.println("Multipication Table");
		Scanner input = new Scanner(System.in);
		System.out.println("Enetr a number: ");
		int num = input.nextInt();
		printMultiplicationTable(num);
	}
	public static void printMultiplicationTable(int num) {
		int i = 1;
		while (i<=10) {
			System.out.println(num + "X" + i + "=" + (num*i));
			i++;
		}
	}
}
