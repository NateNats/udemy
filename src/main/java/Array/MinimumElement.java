package Array;

import java.util.Arrays;

public class MinimumElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 7, 2, 3, 4, 8, 6, 12};
        readIntegers(arr);
    }

    public static void readIntegers(int[] arr){
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.printf("Minimum element in array: %d", findMin(arr));
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                int temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        return min;
    }
}
