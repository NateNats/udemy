/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codingExercise20 {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(19, 99, 9));
        System.out.println(isValid(9));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (isValid(number1) && isValid(number2) && isValid(number3)) {
            if ((number1 % 10 == number2 % 10) || (number2 % 10 == number3 % 10) || (number1 % 10 == number3 % 10)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
