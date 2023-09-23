package Abstract;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){}

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%2d quantity at $%8.2f each, %-15s %-35s %n",
                quantity, price, type, description);
    }

    public double getSalesprice(int quantity){
        return price * quantity;
    }

    abstract void showDetails();
}

class Item extends ProductForSale{
    public Item(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("this " + type + " is a beautiful reproduction");
        System.out.printf("the price of the price is $%6.2f %n", price);
        System.out.println(description);
    }
}

class Store {
    private static ArrayList<ProductForSale> itemSale = new ArrayList<>();

    public static void main(String[] args) {
        itemSale.add( new Item("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        itemSale.add(new Item("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));
//        AllitemInfo();
        System.out.println("-".repeat(20));
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 2);
        printOrder(order1);
    }

    public static void AllitemInfo(){
        for (var item : itemSale){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, itemSale.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;

        for (var item : order){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesprice(item.quantity());
        }
        System.out.printf("Sales total: $%6.2f %n", salesTotal);
    }
}
