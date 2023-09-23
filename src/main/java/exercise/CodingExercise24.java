/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class CodingExercise24 {

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(getDigitCount(number));
        System.out.println(reverse(number));
        numberToWords(number);
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
            return count;
        }
    }

    public static int reverse(int number) {
        int remainder = 0, reverse = 0;

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    public static void numberToWords(int number) {
        int remainder = 0;

        while (number > 0) {
            remainder = number % 10;

            String numberWords = switch (remainder) {
                case 0 -> {
                    yield "Zero";
                }
                case 1 ->
                    "One";
                case 2 ->
                    "Two";
                case 3 ->
                    "Three";
                case 4 ->
                    "four";
                case 5 ->
                    "Five";
                case 6 ->
                    "Six";
                case 7 ->
                    "Seven";
                case 8 ->
                    "eight";
                case 9 ->
                    "Nine";
                default ->
                    "Invalid";
            };
            System.out.println(numberWords);

            number = number / 10;
        }
    }
}
