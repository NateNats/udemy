package Udemy.challenge.Bedroom;

public class Bedroom {
    private String name;
    private Wall north;
    private Wall south;
    private Wall east;
    private Wall west;
    private Lamp lamp;
    private Bed bed;
    private Ceiling ceiling;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3,
                   Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.north = wall4;
        this.east = wall2;
        this.south = wall3;
        this.west = wall1;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();

        System.out.println("Wall direction: " + wall1.getDirection());
        System.out.println("Wall direction: " + wall2.getDirection());
        System.out.println("Wall direction: " + wall3.getDirection());
        System.out.println("Wall direction: " + wall4.getDirection());
    }
}
