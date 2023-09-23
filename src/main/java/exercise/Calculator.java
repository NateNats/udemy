package exercise;

import java.util.Scanner;

public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getDivisionResult() {
        return this.firstNumber/this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double firstNumber, secondNumber;
        Calculator cal = new Calculator();
        System.out.print("set First Number: ");
        firstNumber = scan.nextDouble();
        cal.setFirstNumber(firstNumber);
        System.out.print("set Second Number: ");
        secondNumber = scan.nextDouble();
        cal.setSecondNumber(secondNumber);
        System.out.println(cal.getAdditionResult());
        System.out.println(cal.getSubtractionResult());
        System.out.println(cal.getMultiplicationResult());
        System.out.println(cal.getDivisionResult());
    }
}
