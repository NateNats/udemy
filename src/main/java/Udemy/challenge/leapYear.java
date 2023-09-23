/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy.challenge;

/**
 *
 * @author Nicolaus
 */
public class leapYear {

    public static void main(String[] args) {
        getDaysInMonth(2, 2017);
    }

    static boolean isLeapYear(int year) {
        boolean leapYear;
        if (year % 4 == 0) {
            leapYear = true;

        } else {
            leapYear = false;
        }
        return leapYear;
    }

    static void getDaysInMonth(int month, int year) {
        int day;
        String monthString;

        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            day = 31;
        } else {
            day = 30;
        }

        switch (month) {
            case 1 -> {
                monthString = "January";
                day = 31;
            }
            case 2 -> {
                monthString = "February";
                if (year % 4 == 0) {
                    day = 29;
                } else {
                    day = 28;
                }
            }
            case 3 ->
                monthString = "March";
            case 4 ->
                monthString = "April";
            case 5 ->
                monthString = "May";
            case 6 ->
                monthString = "June";
            case 7 ->
                monthString = "July";
            case 8 ->
                monthString = "August";
            case 9 ->
                monthString = "September";
            case 10 ->
                monthString = "October";
            case 11 ->
                monthString = "November";
            case 12 ->
                monthString = "December";
            default ->
                monthString = "invalid input";
        }
        if (month == 1 || month == 12) {
            System.out.println(monthString + " has " + day + " days");
        } else {
            System.out.println("invalid input");
        }
    }

}
