import java.util.*;
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = input.nextInt();
        int array[] = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Array Element #" + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++){
            sum+=array[i];
        }
        if (sum>0){
            System.out.println("The Missing Number is: -"+sum);
        }else{
            System.out.println("The Missing Number is: " + Math.abs(sum));
        }
    }
}