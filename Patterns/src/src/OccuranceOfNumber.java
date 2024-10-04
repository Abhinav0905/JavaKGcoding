public class OccuranceOfNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the Occurance of Number Program !");
        int[] number = {1,2,3,4,1,5,6,7,8,2,4,5,7,9,10,3,5,7,8,19,2,1,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i : number) {
            if ( i == 5) {
                count++;
                System.out.println("The number 5 occurs " + count + " times in the array");
            }

        }
    }
}
