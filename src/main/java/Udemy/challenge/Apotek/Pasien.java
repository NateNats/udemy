package Udemy.challenge.Apotek;

public class Pasien {
    private String namaPasien;
    private String alamatPasien;

    public Pasien(String namaPasien, String alamatPasien) {
        this.namaPasien = namaPasien;
        this.alamatPasien = alamatPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public void setAlamatPasien(String alamatPasien) {
        this.alamatPasien = alamatPasien;
    }

    @Override
    public String toString() {
        return "Nama Pasien: " + getNamaPasien() + "\nAlamat Pasien: " + getAlamatPasien();
    }
}
