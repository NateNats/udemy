/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise6 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        boolean check;
        a = 1000 * a;
        b = 1000 * b;
        a = Math.round(a);
        b = Math.round(b);
        if (a == b) {
            check = true;
        } else {
            check = false;
        }

        return check;
    }

}
