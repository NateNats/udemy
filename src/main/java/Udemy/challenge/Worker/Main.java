package Udemy.challenge.Worker;

public class Main {

    public static void main(String[] args) {
        Employee nate = new Employee("Nate", "27/01/2004", "27/01/2025");
        System.out.println(nate);

        System.out.println("Age = " + nate.getAge());
        System.out.println("Pay = " + nate.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "01/04/2004", "24/11/2025", 50000);
        System.out.println(Joe);
        System.out.println("Age = " + Joe.getAge());
        System.out.println("Pay = " + Joe.collectPay());

        HourlyPayRate mary = new HourlyPayRate("Mary", "05/05/2004", "05/05/2025", 15);
        System.out.println(mary);
        System.out.println("Pay collect = " + mary.collectPay());
        System.out.println("doubel pay = " + mary.getDoublePay());
    }
}
