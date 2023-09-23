/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercise;

/**
 *
 * @author Nicolaus
 */
public class CodeExercise1 {

    public static void main(String[] args) {
        checkNumber(5);
    }
    
    public static void checkNumber (int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        
    }
}
