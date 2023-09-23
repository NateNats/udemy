package Abstract;

import java.util.ArrayList;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    public String getExplicitType(){
        return getClass().getSimpleName() + "(" + type +  ")";
    }
}

abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed){
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();

}

class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }
}

class Dog extends Mammal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if  (type ==  "wolf"){
            System.out.print("Howling!!");
        } else {
            System.out.print("Woof!!");
        }
    }
}

class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " lazily swimming");
        } else {
            System.out.println(getExplicitType() + " fast swimming");
        }
    }

    @Override
    public void makeNoise() {
        if  (type ==  "goldfish"){
            System.out.print("swish!!");
        } else {
            System.out.print("splash!!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Husky","big", 250);
        dog.makeNoise();

        Dog dog2 = new Dog("wolf","big", 250);
        doAnimalStuff(dog2);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("wolf","big", 250));
        animals.add(new Dog("Husky","big", 250));
        animals.add(new Fish("Goldfish", "small", 100));
        animals.add(new Fish("Cupang", "very small", 50));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for (Animal animal : animals){
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentAnimal){
                currentAnimal.shedHair();
            }

        }
    }

    private static void doAnimalStuff (Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}