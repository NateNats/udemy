/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class CodingExcerise23 {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(9));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int a = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    a += i;
                }
            }
            if (a == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
