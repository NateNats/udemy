package BillsBurger;

public class MealOrder {
    private Item drink;
    private Item sideItem;
    private Burger burger;

    public MealOrder(Item drink, Item sideItem, Burger burger) {
        this.drink = drink;
        this.sideItem = sideItem;
        this.burger = burger;
    }

    public double totalPrice() {
        return burger.getExtraPrice() + sideItem.getExtraPrice() + drink.getExtraPrice();
    }
}
