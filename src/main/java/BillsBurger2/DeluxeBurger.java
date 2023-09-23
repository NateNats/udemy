package BillsBurger2;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White roll");
    }

    @Override
    public void displayBase() {
        System.out.println("Cannot not add additional items to a deluxe burger");
        super.displayBase();
        addHamburgerAddition1("chips", 2.75);
        addHamburgerAddition2("Drink", 1.81);
    }
}
