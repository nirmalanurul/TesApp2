package Nomor2_DLinkedList;

public class Aktivitas {
    private String waktu;
    private String deskripsi;
    private String lokasi;

    public Aktivitas(String waktu, String deskripsi, String lokasi) {
        this.waktu = waktu;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
