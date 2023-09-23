package Array;

import java.util.Arrays;

public class MultipleArray {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (var i : arr){
            for (var j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (var i : arr){
            System.out.println(Arrays.toString(i));
        }

        System.out.println(Arrays.deepToString(arr));

        Object[] arr2 = new Object [3];

        arr2[0] = new String[] {"a", "b", "c"};
        arr2[1] = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        arr2[2] = new double[2][2][2];

        for (Object i : arr2){
            System.out.println("Element type: " + i.getClass().getSimpleName());
            System.out.println("Element toString(): " + i);
            System.out.println(Arrays.deepToString((Object[]) i));
        }
    }
}
