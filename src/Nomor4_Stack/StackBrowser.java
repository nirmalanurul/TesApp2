package Nomor4_Stack;

public class StackBrowser {
    private Node top;
    private int size;

    public StackBrowser() {
        top = null;
        size = 0;
    }

    // PUSH
    public void push(HalamanBrowser halaman) {
        Node nodeBaru = new Node(halaman);
        nodeBaru.setNext(top);
        top = nodeBaru;
        size++;
        System.out.println("Halaman berhasil dikunjungi.");
    }

    // POP
    public void pop() {
        if (top == null) {
            System.out.println("Tidak ada halaman sebelumnya!");
            return;
        }
        System.out.println(
                "Kembali dari: "
                        + top.getData().getJudulHalaman()
        );
        top = top.getNext();
        size--;
    }

    // LIHAT HALAMAN SAAT INI
    public void peek() {
        if (top == null) {
            System.out.println("Belum ada halaman!");
            return;
        }

        System.out.println("\n=== HALAMAN SAAT INI ===");
        System.out.println(
                top.getData().getJudulHalaman()
                        + " | "
                        + top.getData().getUrl()
                        + " | "
                        + top.getData().getWaktuKunjungan()
        );
    }

    // DISPLAY STACK
    public void display() {
        if (top == null) {
            System.out.println("Riwayat kosong!");
            return;
        }
        Node pointer = top;
        System.out.println("\n=== RIWAYAT BROWSER ===");
        while (pointer != null) {
            System.out.println(
                    pointer.getData().getJudulHalaman()
                            + " | "
                            + pointer.getData().getUrl()
            );
            pointer = pointer.getNext();
        }
    }

    // SIZE
    public int getSize() {
        return size;
    }
}