package Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Supra");
        runRace(car);

        Car ferrari = new HybridCar("Ferrari", 293.3, 1234, 6);
        runRace(ferrari);
    }

    public static void runRace (Car car){
        car.startEngine();
        car.drive();
    }
}
