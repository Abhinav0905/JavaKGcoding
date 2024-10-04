import java.util.Scanner;

public class FindMonthOfTheYear {
    public static void main(String[] args) {
        System.out.println(" Enter the Number to find the Month of the Year");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        getMonth(month);
        System.out.println(" The month of the year is " + getMonth(month));
    }

    public static String getMonth(int month) {
        String MonthName = "";
        switch (month) {
            case 1:
                MonthName = "January";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "July";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            case 12:
                MonthName = "December";
                break;
            default:
                MonthName = "Invalid Month";
                break;
        }
        return MonthName;
    }
}
