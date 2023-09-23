/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class CodingExecercise18 {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(200));

    }

    public static int getEvenDigitSum(int number) {
        int sum = 0, a = 0;

        if (number >= 0) {

            while (number > 0) {
                sum = number % 10;

                if (sum % 2 == 0) {
                    a += sum;
                } else {
                    sum = 0;
                }
                number = number / 10;
            }
        } else {
            return -1;
        }
        return a;
    }
}
