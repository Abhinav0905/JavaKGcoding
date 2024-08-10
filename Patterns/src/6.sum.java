import java.util.Scanner;

class sum {
    public static void main(String[] args) {
        System.out.println("Plesae enter 1st numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number:  ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is " + sum);

    }
}
