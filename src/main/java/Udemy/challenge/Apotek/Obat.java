package Udemy.challenge.Apotek;

public class Obat {
    private String[] namaObat;
    private int[] hargaObat;

    public Obat(){

    }
    public Obat(String[] namaObat, int[] hargaObat) {
        this.namaObat = namaObat;
        this.hargaObat = hargaObat;
    }

    public String[] getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String[] namaObat) {
        this.namaObat = namaObat;
    }

    public int[] getHargaObat() {
        return hargaObat;
    }

    public void setHargaObat(int[] hargaObat) {
        this.hargaObat = hargaObat;
    }

    void display(){
        for (int i = 0; i < getHargaObat().length; i++){
            System.out.printf("Nama obat ke-%d: %s%n", (i+1), getNamaObat()[i]);
            System.out.printf("harga obat: %d%n",getHargaObat()[i]);
        }
    }

    void perbandingan(){
        int hargaTermahal = getHargaObat()[0];
        int hargaTermurah = getHargaObat()[0];
        String namaObatTermurah = getNamaObat()[0];
        String namaObatTermahal = getNamaObat()[0];
        int totalBiaya = 0;

        for (int i = 0; i < getHargaObat().length; i++){
            totalBiaya += getHargaObat()[i];
            if (hargaTermahal < getHargaObat()[i]){
                hargaTermahal = getHargaObat()[i];
                namaObatTermahal = getNamaObat()[i];

            }

            if (hargaTermurah > getHargaObat()[i]){
                hargaTermurah = getHargaObat()[i];
                namaObatTermurah = getNamaObat()[i];
            }
        }
        System.out.println("-".repeat(32));
        System.out.printf("Total biaya: %d%n", totalBiaya);
        System.out.printf("Harga termurah: %d (%S)%n", hargaTermurah, namaObatTermurah);
        System.out.printf("Harga termahal: %d (%S)%n", hargaTermahal, namaObatTermahal);
        System.out.println("=".repeat(32));
    }
}
