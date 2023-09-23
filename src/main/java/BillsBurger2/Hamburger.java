package BillsBurger2;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void displayBase() {
        System.out.printf("%s burger on %s with %s, price is %.2f%n", name, breadRollType, meat, price);
    }

    public double getPriceBase() {
        return price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        if (addition1Name.equals("Should not do this")){
            return;
        }
        setAddition1Price(addition1Price);
        System.out.printf("Added %s for an extra %.2f%n", addition1Name, getAddition1Price());
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        if (addition2Name.equals("Should not do this")){
            return;
        }
        setAddition2Price(addition2Price);
        System.out.printf("Added %s for an extra %.2f%n", addition2Name, getAddition2Price());
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        if (addition3Name.equals("Should not do this")){
            return;
        }
        setAddition3Price(addition3Price);
        System.out.printf("Added %s for an extra %.2f%n", addition3Name, getAddition3Price());
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        if (addition4Name.equals("Should not do this")){
            return;
        }
        setAddition4Price(addition4Price);
        System.out.printf("Added %s for an extra %.2f%n", addition4Name, getAddition4Price());
    }

    public double getTotalprice() {
        return getPriceBase() + getAddition1Price() + getAddition2Price() + getAddition3Price() + getAddition4Price();
    }
}
