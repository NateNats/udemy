package NestedClass;

import NestedClass.Employee.Employee;
import NestedClass.Employee.EmployeeComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Brian", 15134, 2020),
                new Employee("Nicolaus", 25612, 2021),
                new Employee("Candra", 23561, 2019),
                new Employee("Ananda", 51242, 2018) ));

        var comparator = new EmployeeComparator<>();
        employees.sort(comparator);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
