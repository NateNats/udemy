package Udemy.challenge.Apotek;

public class Dokter {
    private String namaDokter;
    private String IdDokter;

    public Dokter(String namaDokter, String idDokter) {
        this.namaDokter = namaDokter;
        IdDokter = idDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public void setIdDokter(String idDokter) {
        IdDokter = idDokter;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public String getIdDokter() {
        return IdDokter;
    }

    @Override
    public String toString() {
        return "Nama Dokter: " + getNamaDokter() + "\nID Dokter: " + getIdDokter();
    }
}
