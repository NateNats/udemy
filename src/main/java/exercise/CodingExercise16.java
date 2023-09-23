/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class CodingExercise16 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(111));
    }

    static boolean isPalindrome(int number) {
        int LastDigit = 0, n = 0, i = number, o = number;
        double c = 0;
        //get n
        while (o > 9) {
            LastDigit = o % 10;
            o = o / 10;
            n++;
        }

        while (i != 0) {
            LastDigit = i % 10;

            double b = LastDigit * Math.pow(10, n);
            c += b;
            i = i / 10;
            n--;
        }

        if (i == number) {
            return true;
        } else {
            return false;
        }

    }
}

/* 
                     12212
1             2        2         1           2
 10000  +       2000  +   200  +    10  +       2
a * 10^4   + a * 10^3 + a * 10^2 + a * 10^1 + a * 10^0   
    
 */
