/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author Nicolaus
 */
public class CodingExercise28 {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    
    public static void inputThenPrintSumAndAverage () {
        Scanner sc = new Scanner(System.in);
        String a;
        int aInt, sum = 0, count = 0;
        long avg;
        boolean check = true;

        while (check){
            a = sc.next();
            try {
                aInt = Integer.parseInt(a);
                if (aInt >= 0 && aInt <= 100) {
                    sum += aInt;
                    count++;
                }
            } catch (NumberFormatException e) {
                check = false;
            }
        }
        avg = sum / count;
        System.out.println("SUM = " + sum + " AVG = " + avg);

    }
    
}
