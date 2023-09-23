package BillsBurger;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;
    public Burger(String type, String name, double price){
        super("Burger", name, price);
    }

    public double setToppingPrice(String topping){
        return switch(topping.toUpperCase()){
            case "CHILLI" -> getBasePrice() + 1.5;
            case "PICKLES" -> getBasePrice() + 1;
            case "HOT SAUCE" -> getBasePrice() + 1;
            default -> 0;
        };
    }
    public void addTopping (String extra1, String extra2,
                          String extra3) {
        this.extra1 = new Item("TOPPING", extra1, setToppingPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, setToppingPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, setToppingPrice(extra3));
    }


}
