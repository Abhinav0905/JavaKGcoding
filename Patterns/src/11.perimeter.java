import java.util.Scanner;

class perimeter {
	public static void main(String[] args) {
		System.out.println("Enter the length of the rectangle ");
		Scanner input = new Scanner(System.in);
		float length = input.nextFloat();
		System.out.println("Enter the breadth of the rectangle ");
		float breadth = input.nextFloat();

		float p = 2 * (length + breadth);

		System.out.println("The perimeter of the rectangle is " + p);

	}
}
