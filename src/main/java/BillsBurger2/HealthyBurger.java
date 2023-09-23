package BillsBurger2;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, addition1Price);
    }

    public void addHealthyAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);
    }

    public void addHealthyAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name, addition3Price);
    }

    public void addHealthyAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4(addition4Name, addition4Price);
    }
}
