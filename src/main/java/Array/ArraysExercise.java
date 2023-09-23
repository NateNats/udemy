package Array;
import java.util.*;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        getAscArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getRandomArray(int len){
        int[] arr = new int[len];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int[] getAscArr(int[] arr){
        int temp;

        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] < arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
