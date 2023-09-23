package Udemy.challenge.Animal;

public class Animal {
    private String size, type;
    double weight;

    Animal(){

    }
    Animal(String type, String size, double weight){
        this.size = size;
        this.type = type;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void MakeNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
