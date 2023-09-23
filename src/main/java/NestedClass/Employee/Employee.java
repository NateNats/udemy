package NestedClass.Employee;

public class Employee {
    private String name;
    private int id;
    private int yearStarted;

    public Employee() {
    }

    public Employee(String name, int id, int yearStarted) {
        this.name = name;
        this.id = id;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%d   %-8s   %d".formatted(id, name, yearStarted);
    }
}
