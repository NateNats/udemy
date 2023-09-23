package ArrayList;

import java.util.*;

public class Challenge {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        ArrayList<String> groceries = new ArrayList<>();

        while(loop){
            printOption();
            switch (Integer.parseInt(sc.nextLine())){

                case 1 -> {
                    addItem(groceries);

                } case 2 -> {
                    if (groceries.isEmpty()){
                        System.out.println("there is no one item in your list");
                    } else {
                        removeItem(groceries);
                    }

                } case 3 -> {
                    if (groceries.size() == 1){
                        System.out.println("Your item: " + groceries);
                    } else if (groceries.size() >= 2){
                        System.out.println("Your item(s): " + groceries);
                    } else if (groceries.isEmpty()){
                        System.out.println("there is no one item in your list");
                    }
                } default -> {
                    loop = false;
                }
            }
            System.out.println();
        }
    }

    static void printOption(){
        System.out.print("0 - shutdown\n1 - add item(s)\n2 - remove item(s)\n3 - show item(s)\nEnter a number for which action you want to do: ");
    }

    static ArrayList<String> addItem(ArrayList<String> listItem){

        System.out.print("Enter item you want to add: ");
        String[] splits = sc.nextLine().toLowerCase().split(",");
        listItem.addAll(List.of(splits));

        for (int i = 0; i < listItem.size()-1; i++){
            for (int j = 0; j < listItem.size()-1; j++){
                if (listItem.get(i).toLowerCase().equals(listItem.get(j+1).toLowerCase())){
                    listItem.remove(j+1);
                }
            }
        }
        return listItem;
    }

    static ArrayList<String> removeItem(ArrayList<String> listItem){

        System.out.print("Enter item you want to remove: ");
        String remove = sc.nextLine().toLowerCase();

        String[] splitsRemove = remove.split(",");

        for (String i : splitsRemove){
            listItem.remove(i);
        }

        return listItem;
    }
}
