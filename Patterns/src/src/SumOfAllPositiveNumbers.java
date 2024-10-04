import java.util.Scanner;

public class SumOfAllPositiveNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of all the Positive Number Programs !");
        Scanner input =  new Scanner(System.in);
        // System.out.println("Enter the numbers you wanted to add: ");
         int number = input.nextInt();
        // int number [] = new int[number];
        for (int i = 0 ; i < number ; i++) {
            System.out.println("ENetr the Number: " );
            int num = input.nextInt();
            SumOfAllPositiveNumbers sumOfAllPositiveNumbers = new SumOfAllPositiveNumbers();
            sumOfAllPositiveNumbers.addPositiveNumbers(num);

        }
    }

    private int addPositiveNumbers(int num) {
        int sum = 0;
        if(num > 0 ) {
            return num;
        }
        return 0;
    }
}
