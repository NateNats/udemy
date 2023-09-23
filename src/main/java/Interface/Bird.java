package Interface;

public class Bird extends Animal implements flightEnabled, trackable {

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coodinates recorded");
    }

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }
}

class main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        animal.move();
//        flightEnabled flier = bird;
//        trackable tracked = bird;

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();
        inFlight(bird);
    }

    private static void inFlight (flightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
