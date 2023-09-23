/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author Nicolaus
 */
public class codeExercise3 {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        int megaBytes = KiloBytes / 1024;
        int kiloRemainder = KiloBytes % 1024;

        System.out.println(KiloBytes + " KB = " + megaBytes + " MB and " + kiloRemainder + " KB");
    }

    // 1MB = 1024KB
    // 2 MB = 2048KB
    // 2500KB = 2MB dan 452KB
}
