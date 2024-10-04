import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcoem to the Number Guessing Game ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
        numberGuessingGame.checkNumber(number) ;
        System.out.println("You have guessed the correct number");
    }
    public boolean checkNumber( int number) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the number to guess: ");
            number = input.nextInt();
        } while (number != 5);
        return true;
    }
}
