import java.util.Scanner;

public class StudentScoreChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Score Checker!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's score: ");
        int score = input.nextInt();
        StudentScoreChecker studentScoreChecker = new StudentScoreChecker();
        System.out.println(" The Student Score is " + score + " and the Student Performance is " + studentScoreChecker.checkScore(score));
    }

    public String checkScore(int score) {
        String result = (score >= 80) ? "High" : (score >= 60 && score < 80) ? "Moderate" : (score <60) ? "Low" : "Invalid";
        return result;
        }
}
