package BillsBurger;

public class Main {

    public static void main(String[] args) {
        Item drink = new Item("Drink", "7-Up", 1.5);
//        drink.setSizeItem("LARGE");
        System.out.println(drink.toString());

        Burger burger = new Burger ("Burger", "American Burger", 2.75);
        burger.setSizeItem("Large");
        burger.addTopping("Chilli", "pickles", "hot sauce ");
        System.out.println(burger.toString());

        Item frenchFried = new Item ("Side item", "French Fried", 2);
        frenchFried.setSizeItem("LARGE");
        System.out.println(frenchFried.toString());

        MealOrder meal = new MealOrder(drink, frenchFried, burger);
        System.out.println("Total price:" + meal.totalPrice());
    }
}
