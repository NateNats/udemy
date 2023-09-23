/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise8 {

    public static void main(String[] args) {
        System.out.println(hasTeen(30, 30, 30));
    }

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        boolean check;
        if ((teen1 >= 13 && teen1 <= 19) || (teen2 >= 13 && teen2 <= 19)
                || (teen3 >= 13 && teen3 <= 19)) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static boolean isTeen(int teen) {
        boolean check;
        if (teen >= 13 && teen <= 19) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}
