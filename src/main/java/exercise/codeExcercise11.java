/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise11 {

    public static void main(String[] args) {
        printEqual(0, 1, 2);
    }

    public static void printEqual(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0) {
            if (a == b && b == c && a == c) {
                System.out.println("All numbers are equal");
            } else if (a == b || b == c || a == c) {
                System.out.println("Neither all are equal or different");
            } else if (a != b && b != c && a != c) {
                System.out.println("All numbers are different");
            }

        } else {
            System.out.println("Invalid Value");
        }
    }

}
