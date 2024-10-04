import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        System.out.println("Welcome to the Password Checker Program!");
        String password = "password";
        PasswordChecker passwordChecker = new PasswordChecker();
        passwordChecker.isvalidcheckpassword(password);

    }

    public boolean isvalidcheckpassword(String password) {
        Scanner input = new Scanner(System.in);
        String passcode;
        do {
            System.out.println("Enter the password: " );
            passcode = input.nextLine();
        } while (password == "password");
             return true;
        }

    }

