/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class challenge_IsEvenNumber {

    public static void main(String[] args) {
        int FirstNumber = 4, LastNumber = 20;

        while (FirstNumber <= LastNumber) {
            System.out.println(IsEvenNumber(FirstNumber, LastNumber));
            FirstNumber++;
        }

    }

    static boolean IsEvenNumber(int a, int b) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
