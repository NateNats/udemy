package Gudang;
import java.util.ArrayList;
import java.util.Scanner;

record DataPelanggan(String nama, String nomerHp, String alamat){}
record BarangPel(DataPelanggan pelanggan, String namaBarang, String jenis, int harga){

    @Override
    public String toString() {
        return String.format("Nama Pelanggan: %s%nNomer hp: %s%nAlamat: %s%nNama barang: %s%nJenis barang: %s%nHarga penitipan: %d",
                pelanggan.nama(), pelanggan.nomerHp(), pelanggan.alamat(), namaBarang, jenis, harga);
    }
}
public class PenitipanBarang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<BarangPel> barang = new ArrayList<>();

        System.out.print("Masukan nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Masukan nomer HP: ");
        String noHp = sc2.next();
        System.out.print("Masukan Alamat: ");
        String alamat = sc.nextLine();
        DataPelanggan pelanggan = new DataPelanggan(nama, noHp, alamat);

        System.out.print("Masukan nama barang: ");
        String namaBarang = sc.nextLine();
        System.out.print("Masukan jenis barang: ");
        String jenis = sc.nextLine();

        barang.add(new BarangPel(pelanggan, namaBarang, jenis, 2000));

        System.out.println(barang);


    }
}
