package Array;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr  = getRandomArr(10);
        System.out.println(Arrays.toString(arr));

        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

        int[] arrSet = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arrSet));

    }

    public static int[] getRandomArr(int len){
        int[] newInt = new int[len];
        Random random = new Random();

        for (int i = 0; i < newInt.length; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
