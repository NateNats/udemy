package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();

        for (int i = 0; i < list.size(); i++){
            list.set(i, random.nextInt(100));
        }

        System.out.println(list);
    }
}
