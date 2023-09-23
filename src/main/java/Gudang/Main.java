package Gudang;

import java.util.*;

record Barang(String nama, String jenis, int jumlah) {
    public Barang(String nama) {
        this(nama, "Sembarang", 1);
    }

    @Override
    public String toString() {
        return String.format("Barang %s berjenis %s ada %d", nama, jenis, jumlah);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        ArrayList<Barang> gudang = new ArrayList<>();

        System.out.print("Masukan jumlah barang yang akan dimasukan ke gudang: ");
        int jumlah = sc.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan nama barang: ");
            String nama = sc2.nextLine();
            System.out.print("Masukan jenis barang: ");
            String jenis = sc2.nextLine();
            System.out.print("Masukan jumlah barang: ");
            int jumBar = sc.nextInt();

            gudang.add(new Barang(nama, jenis, jumBar));
            System.out.println();
        }

        System.out.println(gudang);
    }
}