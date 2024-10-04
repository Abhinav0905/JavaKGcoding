import java.util.Scanner;

public class TernaryOddEven {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ternary Odd/Even Program!");
        Scanner input = new Scanner( System.in);
        System.out.println("Enetr the number to check if it is odd or even: ");
        int number = input.nextInt();
        TernaryOddEven ternaryOddEven = new TernaryOddEven();
        ternaryOddEven.checkOddEven(number);
        System.out.println(" The number is " + ternaryOddEven.checkOddEven(number));
    }
    public String checkOddEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
