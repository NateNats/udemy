package Udemy.challenge.Apotek;

public class Resep {
    private Dokter dokter;
    private Pasien pasien;
    private Obat obat;

    public Resep(Dokter dokter, Pasien pasien, Obat obat) {
        this.dokter = dokter;
        this.pasien = pasien;
        this.obat = obat;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Obat getObat() {
        return obat;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    void displayAll(){
        System.out.println(dokter.toString());
        System.out.println(pasien.toString());
        getObat().display();
        getObat().perbandingan();
    }
}
