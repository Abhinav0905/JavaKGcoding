
public class MaximumValueInIntegarArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Maximum Value in Integer Array Program !");
        int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // find greatest number in this array using for each loop
        int max = number[0];
        for (int i : number) {
            if (i > max) {
                max = i ;
            System.out.println("The maximum value in the array is " + max);
            }
        }
    }
}
