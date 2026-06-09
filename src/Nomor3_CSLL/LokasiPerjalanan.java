package Nomor3_CSLL;

public class LokasiPerjalanan {
    private String namaTempat;
    private String jamTiba;
    private String catatanSingkat;

    public LokasiPerjalanan(String namaTempat, String jamTiba, String catatanSingkat) {
        this.namaTempat = namaTempat;
        this.jamTiba = jamTiba;
        this.catatanSingkat = catatanSingkat;
    }

    public String getNamaTempat() {
        return namaTempat;
    }

    public void setNamaTempat(String namaTempat) {
        this.namaTempat = namaTempat;
    }

    public String getJamTiba() {
        return jamTiba;
    }

    public void setJamTiba(String jamTiba) {
        this.jamTiba = jamTiba;
    }

    public String getCatatanSingkat() {
        return catatanSingkat;
    }

    public void setCatatanSingkat(String catatanSingkat) {
        this.catatanSingkat = catatanSingkat;
    }
}
