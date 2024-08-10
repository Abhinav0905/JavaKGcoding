import java.util.Scanner;

class welcome {
    public static void main (String [] args) {
        System.out.println("Good Morning " + "Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG Coding School");
    }
}
