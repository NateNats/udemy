/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise9 {

    public static void main(String[] args) {
        System.out.println(area(8.5));
        System.out.println(area(-5.0, -4.0));
    }

    public static double area(double radius) {
        double Return;
        double PI = Math.PI;
        if (radius < 0) {
            Return = -1.0;
        } else {
            radius = Math.pow(radius, 2);
            Return = radius * PI;
        }
        return Return;
    }

    public static double area(double x, double y) {
        double Return;
        if (x * y < 0) {
            Return = -1.0;
        } else {
            Return = x * y;
        }
        return Return;
    }
}
