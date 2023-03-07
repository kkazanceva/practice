import java.util.Scanner;

public class IndianMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        int size = 0;
        int count = number;
        while (count > 0) {
            count /= 10;
            size += 1;
        }
        int[] numArr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            numArr[i] = number % 10;
            number /= 10;
            }
        int[] sortArrMin = new int[size];
        sortArrMin = numArr;
        for (int i = 0; i < size; i++){
            int pos = i;
            int min = sortArrMin[i];
            for (int j = i+1; j < size; j++){
                if (sortArrMin[j] < min){
                    pos = j;
                    min = sortArrMin[j];
                }
            }
            sortArrMin[pos] = sortArrMin[i];
            sortArrMin[i] = min;
        }
        int[] sortArrMax = new int[size];
        int j = size -1;
        for (int i = 0; i < size; i++){
            sortArrMax[i] = sortArrMin[j];
            j--;
        }
        int maxNum = 0;
        int minNum = 0;
        for(int i = 0; i<size; i++){
            minNum += sortArrMax[i]*(Math.pow(10, i));
        }
        for(int i = 0; i<size; i++){
            maxNum += sortArrMin[i]*(Math.pow(10, i));
        }
        System.out.println(maxNum-minNum);
    }
}