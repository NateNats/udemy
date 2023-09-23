/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class Digit_Sum {

    public static void main(String[] args) {
        System.out.println(DigitSum(123));
    }

    static int DigitSum(int a) {
        int sum = 0;
        if (a > 0) {
            while (a > 9) {
                sum += (a % 10);
                a = (a / 10);
            }

            return sum += a;
        } else {
            return -1;
        }
    }

}
