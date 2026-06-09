package Nomor4_Stack;

public class HalamanBrowser {

    private String url;
    private String judulHalaman;
    private String waktuKunjungan;

    public HalamanBrowser(String url,
                          String judulHalaman,
                          String waktuKunjungan) {

        this.url = url;
        this.judulHalaman = judulHalaman;
        this.waktuKunjungan = waktuKunjungan;
    }

    public String getUrl() {
        return url;
    }

    public String getJudulHalaman() {
        return judulHalaman;
    }

    public String getWaktuKunjungan() {
        return waktuKunjungan;
    }
}