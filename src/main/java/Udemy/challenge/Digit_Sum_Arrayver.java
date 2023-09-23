/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class Digit_Sum_Arrayver {

    public static void main(String[] args) {
        System.out.println(modulo(12));
    }

    static int modulo(int a) {
        int d = 0, f = 0;
        int c [] = new int [1];
        while (a > 9) {
            for (int b = 1; b <= a; b++) {
                c = new int [b];
               d += (a % 10);
               c [b] = d;
            }
            
            for (int e : c){
                f+= e;
            }
        }

        return f;
    }

}
