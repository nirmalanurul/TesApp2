package Nomor2_DLinkedList;

public class DLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // TAMBAH AWAL
    public void addFirst(Node node) {
        if (head == null) {
            inisialisasiData(node);
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
            size++;
        }
    }

    // TAMBAH AKHIR
    public void addLast(Node node) {
        if (head == null) {
            inisialisasiData(node);
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            size++;
        }
    }

    // TAMBAH TENGAH
    public void addMiddle(Node node, String cariWaktu) {
        Node pointer = head;

        while (pointer != null) {
            if (pointer.getData().getWaktu().equals(cariWaktu)) {
                node.setNext(pointer.getNext());
                node.setPrev(pointer);
                if (pointer.getNext() != null) {
                    pointer.getNext().setPrev(node);
                }
                pointer.setNext(node);
                if (pointer == tail) {
                    tail = node;
                }
                size++;
                System.out.println("Aktivitas berhasil ditambahkan.");
                return;
            }

            pointer = pointer.getNext();
        }

        System.out.println("Data waktu tidak ditemukan!");
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
            head.setPrev(null);
        }

        size--;

        System.out.println("Data awal berhasil dihapus.");
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
            tail = tail.getPrev();
            tail.setNext(null);
        }

        size--;

        System.out.println("Data akhir berhasil dihapus.");
    }

    // HAPUS TENGAH BERDASARKAN WAKTU
    public void removeMiddle(String waktu) {
        Node pointer = head;

        while (pointer != null) {
            if (pointer.getData().getWaktu().equals(waktu)) {
                if (pointer == head) {
                    removeFirst();
                    return;
                }
                if (pointer == tail) {
                    removeLast();
                    return;
                }
                pointer.getPrev().setNext(pointer.getNext());
                pointer.getNext().setPrev(pointer.getPrev());
                size--;
                System.out.println("Data tengah berhasil dihapus.");
                return;
            }

            pointer = pointer.getNext();
        }

        System.out.println("Aktivitas tidak ditemukan!");
    }

    // DISPLAY MAJU
    public void displayForward() {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }

        Node pointer = head;

        System.out.println("\n=== AKTIVITAS MAJU ===");
        while (pointer != null) {
            System.out.println(
                    pointer.getData().getWaktu()
                            + " | "
                            + pointer.getData().getDeskripsi()
                            + " | "
                            + pointer.getData().getLokasi()
            );
            pointer = pointer.getNext();
        }
    }

    // DISPLAY MUNDUR
    public void displayBackward() {
        if (tail == null) {
            System.out.println("Data kosong!");
            return;
        }
        Node pointer = tail;

        System.out.println("\n=== AKTIVITAS MUNDUR ===");
        while (pointer != null) {
            System.out.println(
                    pointer.getData().getWaktu()
                            + " | "
                            + pointer.getData().getDeskripsi()
                            + " | "
                            + pointer.getData().getLokasi()
            );
            pointer = pointer.getPrev();
        }
    }

    // JUMLAH DATA
    public int getSize() {
        return size;
    }

    private void inisialisasiData(Node node) {
        head = node;
        tail = node;
        size++;
    }
}