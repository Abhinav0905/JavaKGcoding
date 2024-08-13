import java.util.Scanner;

class oddevencheck {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num%2==0){
			System.out.println("The entered number is an even number " + num);
		}
		else{
			System.out.println("The entered number is an odd number " + num);
		}
	}
}
