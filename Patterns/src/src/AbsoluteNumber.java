import java.util.Scanner;

import static java.lang.Math.abs;

public class AbsoluteNumber {
    public static void main(String[] args) {
        System.out.println(" Welcome to find the Absolute Number Codes=====>>>>>");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the Absolute Number: ");
        int number = input.nextInt();
        AbsoluteNumber absoluteNumber = new AbsoluteNumber();
        absoluteNumber.findAbsoluteNumber(number);
        System.out.println(" The absolute number of " + number + " is " + absoluteNumber.findAbsoluteNumber(number));

    }

    public int findAbsoluteNumber(int number) {
        return abs(number);
    }
}
