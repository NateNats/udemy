package Car;

public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car -> start engine");
    }

    public void drive(){
        System.out.println("you driving a " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("car -> engine run");
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description, double avgKmPerLitre,
                         int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLitre,
                       int batterySize){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders = 6;

    public HybridCar(String description, double avgKmPerLitre,
                     int batterySize, int cylinders){
        super(description);
        this.avgKmPerLitre  = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
