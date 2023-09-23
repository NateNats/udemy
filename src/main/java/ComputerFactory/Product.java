package ComputerFactory;

public class Product {
    private String model, manufacturer;
    private int width, height, depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufaturer){
        super(model, manufaturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        this(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d, %d in color %s", x, y, color));
    }
}

class Motherboard extends Product{
    private int ramSlots, cardSlots;
    private String bios;

    public Motherboard(String model, String manufaturer){
        super(model, manufaturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println(String.format("Program %s is  now loading.....", programName));
    }
}

class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String model, String manufaturer){
        super(model, manufaturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        this(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}


