/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class CodingExercise21 {
    
    public static void main(String[] args) {
        printFactors(18);
    }
    
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++){
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    
}

/*10
  5 2
   2 2
   1 2
*/