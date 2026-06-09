package Nomor1_SLinkedList;

public class Buku {
    private String id;
    private String judul;
    private String penulis;

    public Buku(String id, String judul, String penulis) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
