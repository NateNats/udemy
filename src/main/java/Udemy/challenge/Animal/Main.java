package Udemy.challenge.Animal;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("anjing", "huge", 90);
        Dog dog = new Dog();
        doAnimalStuff(dog, "slow");
        doAnimalStuff(animal, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.MakeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}
