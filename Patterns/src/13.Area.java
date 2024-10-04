import java.util.Scanner;

class Area {
	public static void main(String[] args) {
		System.out.println("Enter the length of the traiangle ");
		Scanner input = new Scanner(System.in);
		float length = input.nextFloat();
		System.out.println("Enter the height of the trainagle ");
		float height = input.nextFloat();

		float area = (1/2f * (length * height));

		System.out.println("The area of the triangle is " + area);
	}
}
