package Nomor3_CSLL;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // TAMBAH AWAL
    public void addFirst(Node node) {
        if (head == null) {
            inisialisasi(node);
        } else {
            node.setNext(head);
            head = node;
            tail.setNext(head);
            size++;
        }
    }

    // TAMBAH AKHIR
    public void addLast(Node node) {
        if (head == null) {
            inisialisasi(node);
        } else {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            size++;
        }
    }

    // TAMBAH TENGAH
    public void addMiddle(Node node, String cariTempat) {
        Node pointer = head;
        do {
            if (pointer.getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(cariTempat)) {
                node.setNext(pointer.getNext());
                pointer.setNext(node);
                if (pointer == tail) {
                    tail = node;
                    tail.setNext(head);
                }
                size++;
                System.out.println("Lokasi berhasil ditambahkan.");
                return;
            }
            pointer = pointer.getNext();
        } while (pointer != head);
        System.out.println("Lokasi tidak ditemukan!");
    }

    // HAPUS AWAL
    public void removeFirst() {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            tail.setNext(head);
        }
        size--;
        System.out.println("Lokasi awal berhasil dihapus.");
    }

    // HAPUS AKHIR
    public void removeLast() {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node pointer = head;
            while (pointer.getNext() != tail) {
                pointer = pointer.getNext();
            }
            tail = pointer;
            tail.setNext(head);
        }
        size--;
        System.out.println("Lokasi akhir berhasil dihapus.");
    }

    // HAPUS TENGAH
    public void removeMiddle(String namaTempat) {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        Node pointer = head;
        do {
            Node nextNode = pointer.getNext();
            if (nextNode.getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(namaTempat)) {
                if (nextNode == tail) {
                    removeLast();
                    return;
                }
                pointer.setNext(nextNode.getNext());
                size--;
                System.out.println("Lokasi tengah berhasil dihapus.");
                return;
            }
            pointer = pointer.getNext();
        } while (pointer != tail);
        System.out.println("Lokasi tidak ditemukan!");
    }

    // DISPLAY
    public void displayData() {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        Node pointer = head;
        System.out.println("\n=== DAFTAR PERJALANAN ===");
        do {
            System.out.println(
                    pointer.getData().getNamaTempat()
                            + " | "
                            + pointer.getData().getJamTiba()
                            + " | "
                            + pointer.getData().getCatatanSingkat()
            );
            pointer = pointer.getNext();
        } while (pointer != head);
    }

    // SIZE
    public int getSize() {
        return size;
    }

    // INISIALISASI
    private void inisialisasi(Node node) {
        head = node;
        tail = node;
        tail.setNext(head);
        size++;
    }

    // ========== TAMBAHAN ==========

    // Method pencarian data (search)
    public LokasiPerjalanan cariData(String namaTempat) {
        if (head == null) {
            return null;
        }
        Node pointer = head;
        do {
            if (pointer.getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(namaTempat)) {
                return pointer.getData();
            }
            pointer = pointer.getNext();
        } while (pointer != head);
        return null;
    }

    // Mengecek apakah suatu tempat ada dalam daftar
    public boolean contains(String namaTempat) {
        if (head == null) {
            return false;
        }
        Node pointer = head;
        do {
            if (pointer.getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(namaTempat)) {
                return true;
            }
            pointer = pointer.getNext();
        } while (pointer != head);
        return false;
    }

    // Menghapus seluruh data.
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Semua lokasi berhasil dihapus.");
    }

    // isEmpty()
    public boolean isEmpty() {
        return head == null;
    }

    // Menampilkan lokasi pertama.
    public void displayFirst() {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        System.out.println(
                head.getData().getNamaTempat()
                        + " | "
                        + head.getData().getJamTiba()
                        + " | "
                        + head.getData().getCatatanSingkat()
        );
    }

    // Menampilkan lokasi terakhir.
    public void displayLast() {
        if (tail == null) {
            System.out.println("Data kosong!");
            return;
        }
        System.out.println(
                tail.getData().getNamaTempat()
                        + " | "
                        + tail.getData().getJamTiba()
                        + " | "
                        + tail.getData().getCatatanSingkat()
        );
    }

    // updateData()
    public void updateData(String namaCari,
                           String namaBaru,
                           String jamBaru,
                           String catatanBaru) {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        Node pointer = head;
        do {
            if (pointer.getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(namaCari)) {

                pointer.getData().setNamaTempat(namaBaru);
                pointer.getData().setJamTiba(jamBaru);
                pointer.getData().setCatatanSingkat(catatanBaru);

                System.out.println("Data berhasil diperbarui.");
                return;
            }
            pointer = pointer.getNext();
        } while (pointer != head);
        System.out.println("Lokasi tidak ditemukan.");
    }

    // Lihat lokasi setelah suatu tempat
    public void lokasiSesudah(String namaTempat) {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        Node pointer = head;
        do {
            if (pointer.getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(namaTempat)) {

                Node sesudah = pointer.getNext();

                System.out.println(
                        "Lokasi sesudah "
                                + namaTempat
                                + " adalah "
                                + sesudah.getData().getNamaTempat()
                );
                return;
            }
            pointer = pointer.getNext();
        } while (pointer != head);
        System.out.println("Lokasi tidak ditemukan!");
    }

    // Lihat lokasi sebelum suatu tempat
    public void lokasiSebelum(String namaTempat) {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }

        Node pointer = head;

        do {

            if (pointer.getNext()
                    .getData()
                    .getNamaTempat()
                    .equalsIgnoreCase(namaTempat)) {

                System.out.println(
                        "Lokasi sebelum "
                                + namaTempat
                                + " adalah "
                                + pointer.getData().getNamaTempat()
                );
                return;
            }

            pointer = pointer.getNext();
        } while (pointer != head);
        System.out.println("Lokasi tidak ditemukan!");
    }
}
