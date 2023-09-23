/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class challenge_NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(-100);
    }
    
    static void printNumberInWord (int number){
        String NumberInWord = switch (number){
            case 0 -> {yield "ZERO";}
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOURTH";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 ->  "NINE";
            default -> "OTHER";
        };
        System.out.println(NumberInWord);
    }
    
}
