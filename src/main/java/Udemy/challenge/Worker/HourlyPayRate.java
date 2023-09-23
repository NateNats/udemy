package Udemy.challenge.Worker;

public class HourlyPayRate extends Employee{
    private double hourlyPayRate;

    public HourlyPayRate(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}
