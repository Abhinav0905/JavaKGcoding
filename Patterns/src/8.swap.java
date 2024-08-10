import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        System.out.println("Welcome to KG coding ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr the 1st number to swap ");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number to swap ");
        int num2 = input.nextInt();
        System.out.println("Before swapping the numbers are " + num1 +  num2 );
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("AFter swapping the numbers are " + num1 +  num2);


    }
}
