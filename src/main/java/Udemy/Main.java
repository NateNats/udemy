package Udemy;

public class Main extends Object{
    public static void main(String[] args) {
        student gerard = new student("gerard", 12);
        System.out.println(gerard);

        studentAndParent anya = new studentAndParent("Anya", "Yor", 5);
        System.out.println(anya);
    }
}

class student {
    private String name;
    private int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class studentAndParent extends student{
    private String parentName;

    public studentAndParent(String name, String parentName, int age) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "studentAndParent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}