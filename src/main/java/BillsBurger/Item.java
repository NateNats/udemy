package BillsBurger;
public class Item {
    private String name;
    private String size = "MEDIUM";
    private double price;
    private String type;

    public Item (String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getItemName(){
        return this.name;
    }
    public double getBasePrice() {
        return this.price;
    }

    public void setSizeItem (String size) {
        this.size = size.toUpperCase();
    }

    public double getExtraPrice() {
        return switch (size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1.0;
            default -> getBasePrice();
        };
    }

    @Override
    public String toString() {
        return "Type: " + this.type +
                "\nName: " + this.name +
                "\nSize: " + this.size +
                "\nPrice: " + getExtraPrice();
    }
}