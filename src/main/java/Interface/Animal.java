package Interface;
enum flightStages implements trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLECTION;

    @Override
    public void track() {
        if (this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }
}
record DragonFly(String name, String type) implements flightEnabled{ //record implement interface flightEnabled

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class satellite implements orbitEarth {
    //class implement interface orbitEarth

    @Override
    public void archieveOrbit() {
        System.out.println("orbit archieved!!!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface orbitEarth extends flightEnabled{
    // interface orbitEarth extends flightEnabled, tidak perlu override method dari flightEnabled

    void archieveOrbit();
}

interface flightEnabled{
    public void takeOff();
    void land();
    void fly();
}

interface trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();

}
