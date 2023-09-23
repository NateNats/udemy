/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise7 {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(2, 2, 3));
        
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        boolean hasEqualSum = true;
        a = a + b;

        if (a == c) {
            hasEqualSum = true;
        } else {
            hasEqualSum = false;
        }
        return hasEqualSum;
    }

}
