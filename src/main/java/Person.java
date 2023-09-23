public abstract class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getName();
}

class student extends Person {
    private String name;
    public student(String name, String age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return name;
    }
}
