/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise12 {
    
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean Return = true;
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                Return = true;
            } else {
                Return = false;
            }
        } else if (summer  == false){
            if (temperature >= 25 && temperature <= 35) {
                Return = true;
            } else {
                Return = false;
            }
        }
        return Return;
    }

}
