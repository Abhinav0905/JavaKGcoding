import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to the Multipication Table Program !");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print the Multiplication Table: ");
        int number = input.nextInt();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printMultiplicationTable(number);
        System.out.println(multiplicationTable.printMultiplicationTable(number));

    }

    public Integer printMultiplicationTable(int number) {
        int i;
        for (i = 1 ; i <= 10 ; i ++) {
            System.out.println(number + " * " + i + " = " + number * i );
        }
        return number;
    }
}
