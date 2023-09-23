package Array;

import java.util.*;

public class MinimumElement2 {

    public static void main(String[] args) {
        int[] returnedArr = readIntegers();
        System.out.println(Arrays.toString(returnedArr));
        System.out.println(findMin(returnedArr));
    }

    private static int[] readIntegers(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a list of integers, by separated by commas: ");
        String input = read.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int el: arr){
            if (el < min){
                min = el;
            }
        }
        return min;
    }
}
