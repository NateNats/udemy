package ArrayList;
import java.util.ArrayList;
import java.util.List;
record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DIARY", 1);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);

        ArrayList<GroceryItem> items = new ArrayList<>();
        items.add(new GroceryItem("Apples"));
        System.out.println(items);

        String[] item = {"apple", "banana", "egg"};
        String[] item2 = {"pickles", "mustard", "cheese"};
        List<String> list = List.of(item);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println(list2);

        ArrayList<String> nextList = new ArrayList<>(List.of(item2));
        System.out.println(nextList);
        nextList.addAll(list2);
        System.out.println(nextList);

//        list2.addAll(List.of(item2));
//        System.out.println(list2);
    }
}
