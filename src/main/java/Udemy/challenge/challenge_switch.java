/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class challenge_switch {
    public static void main(String[] args) {
        PrintDayOfWeek(5);
    }
    
    static void PrintDayOfWeek (int day){
        String DayOfWeek = switch (day){
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "invalid day";
        };
        
        System.out.println(day + " is a " + DayOfWeek);
    }
    
}
