package Udemy.Bioskop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("berapa jumlah film yang akan dimasukkan: ");
        int jumlah = s.nextInt();
        Movie[] movie;
        int i = 0;

        while(i < jumlah){
            System.out.println("Masukan genre (S -> Science Fiction, C -> Comedy, H -> Horror, A -> Adeventure)");
            char genre = s.nextLine().charAt(0);
            System.out.print("Masukan judul: ");
            String judul = s.nextLine();
            i++;
        }
    }
}
