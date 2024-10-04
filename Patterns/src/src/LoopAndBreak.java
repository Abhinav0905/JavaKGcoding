import java.util.Scanner;

public class LoopAndBreak {
    public static void main(String[] args) {
        System.out.println("Welcome to the Loop and Break Program!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to check if it breaks the loop : ");
        String word = input.nextLine();
        LoopAndBreak loopAndBreak = new LoopAndBreak();
        loopAndBreak.checkBreak(word);
        System.out.println(" The word is " + loopAndBreak.checkBreak(word));
    }
    public boolean checkBreak(String word) {
        while (true) {
            if (word.equals("break")) {
                    break;
                }
            } return false;
        }
}

