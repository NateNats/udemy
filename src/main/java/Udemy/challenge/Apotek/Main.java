package Udemy.challenge.Apotek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Masukan jumlah resep untuk pasien: ");
        int jumlahResep = input2.nextInt();

        Resep[] resep = new Resep[jumlahResep];

        for (int i = 0; i < resep.length; i++){
            System.out.printf("Nama dokter ke-%d: ", (i+1));
            String namaDokter = input.nextLine();
            System.out.print("id dokter: ");
            String idDokter = input.nextLine();
            Dokter dokter = new Dokter(namaDokter, idDokter);

            System.out.println();
            System.out.printf("Masukan nama Pasien ke-%d: ", (i+1));
            String namaPasien = input.nextLine();
            System.out.print("Masukan alamat Pasien: ");
            String alamatPasien = input.nextLine();
            Pasien pasien = new Pasien(namaPasien, alamatPasien);

            System.out.println();
            System.out.print("Masukan jumlah obat: ");
            int jumlahObat = input2.nextInt();

            System.out.println();
            String[] namaObat = new String[jumlahObat];
            int[] hargaObat = new int[jumlahObat];

            for (int j = 0; j < jumlahObat; j++){
                System.out.printf("Masukan nama obat ke-%d: ", (j + 1));
                namaObat[j] = input.nextLine();
                System.out.printf("Masukan harga obat ke-%d: ", (j + 1));
                hargaObat[j] = input2.nextInt();
                System.out.println();
            }
            Obat obat = new Obat(namaObat, hargaObat);

            resep[i] = new Resep(dokter, pasien, obat);
            System.out.println("-".repeat(32));
        }

        for (int i = 0; i < resep.length; i++){
            System.out.printf("Menampilkan data resep ke-%d%n", (i+1));
            resep[i].displayAll();
        }
    }
}
