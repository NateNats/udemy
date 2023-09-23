/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class FirstAndLastDigitsSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(902));
    }

    static int sumFirstAndLastDigit(int number) {
        int FirstNumber = number, LastNumber = number, sum;

        if (number > 0) {
            LastNumber = LastNumber % 10;

            while (FirstNumber >= 10) {
                FirstNumber = FirstNumber / 10;
            }
            sum = LastNumber + FirstNumber;
        } else {
            return -1;
        }

        return sum;
    }

}
