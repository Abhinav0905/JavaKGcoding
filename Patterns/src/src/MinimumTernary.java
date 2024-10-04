import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to the find Minimum number in Ternary Operator!");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        MinimumTernary minimumTernary = new MinimumTernary();
        int result = minimumTernary.findMinimum(num1,num2);
        System.out.println("The minimum number is : " + result);
    }

    public int findMinimum(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;

    }
}
