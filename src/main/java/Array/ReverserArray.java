package Array;

import java.util.Arrays;

public class ReverserArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("real me: " + Arrays.toString(reverse(arr)));
        System.out.print("Udemy: ");
        reverse2(arr2);
    }

    public static int[] reverse(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void reverse2(int[] arr){
        int maxIndex = arr.length-1;
        int halfLength = arr.length/2;

        for (int i = 0; i< halfLength; i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
            arr[maxIndex-i] = temp;
            System.out.println(Arrays.toString(arr));
        }

    }
}
