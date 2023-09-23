/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExcercise4 {

    public static void main(String[] args) {
        boolean a = shouldWakeUp(true, 1);
        System.out.println(a);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // hourOfDay range => 0-23

        if (barking == true && hourOfDay == 0 || hourOfDay == 23) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                barking = true;
            } else {
                barking = false;
            }

        } else {
            barking = false;
        }
        return barking;
    }
}
