package Nomor5_Queue;

public class PembeliTiket {

    private int nomorAntrean;
    private String nama;
    private int jumlahTiket;

    public PembeliTiket(int nomorAntrean,
                        String nama,
                        int jumlahTiket) {

        this.nomorAntrean = nomorAntrean;
        this.nama = nama;
        this.jumlahTiket = jumlahTiket;
    }

    public int getNomorAntrean() {
        return nomorAntrean;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }
}