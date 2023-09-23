/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExercise2 {

    public static void main(String[] args) {
        double a = 10.25;
        double c = toMilesPerHour(a);
        System.out.println("check toMilesPerHour: " + c);
        printConversion(a);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        kilometersPerHour *= 0.60934;
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            kilometersPerHour = Math.round(kilometersPerHour);
            return (long) kilometersPerHour;
        }
        return 0;
    }

    public static void printConversion(double kilometersPerHour) {
        double milesPerHour = kilometersPerHour;
        milesPerHour *= 0.60934;
        milesPerHour = Math.round(milesPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
