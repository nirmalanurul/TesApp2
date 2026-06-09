package Nomor1_SLinkedList;

public class SLinkedList {
    private Node head;
    private Node tail;

    public SLinkedList() {
        head = null;
        tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void addFirst(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void addLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

//    public void addMiddle(Node node, String nimCari) {
//        if (head == null) {
//            System.out.println("List kosong");
//            return;
//        }
//
//        Node temp = head;
//
//        while (temp != null) {
//            if (temp.getData().getNim().equals(nimCari)) {
//
//                node.setNext(temp.getNext());
//                temp.setNext(node);
//
//                if (node.getNext() == null) {
//                    tail = node;
//                }
//
//                return;
//            }
//            temp = temp.getNext();
//        }
//
//        System.out.println("NIM tidak ditemukan");
//    }

    public void display() {
        if (head == null) {
            System.out.println("Data is empty");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.println(
                        "Id: " + pointer.getData().getId() +
                                ", Judul: " + pointer.getData().getJudul() +
                                ", Penulis: " + pointer.getData().getPenulis()
                );
                pointer = pointer.getNext();
            }
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }

        head = head.getNext();

        if (head == null) {
            tail = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node pointer = head;

        while (pointer.getNext() != tail) {
            pointer = pointer.getNext();
        }

        pointer.setNext(null);
        tail = pointer;
    }

    public void removeMiddle(String idCari) {

        // Jika list kosong
        if (head == null) {
            System.out.println("List kosong");
            return;
        }

        // Jika data yang dicari ada di head
        if (head.getData().getId().equals(idCari)) {
            removeFirst();
            System.out.println("Buku berhasil dihapus");
            return;
        }

        Node prev = null;
        Node current = head;

        while (current != null &&
                !current.getData().getId().equals(idCari)) {

            prev = current;
            current = current.getNext();
        }

        // Jika ID tidak ditemukan
        if (current == null) {
            System.out.println("Buku tidak ditemukan");
            return;
        }

        // Jika node yang dihapus adalah tail
        if (current == tail) {
            removeLast();
            System.out.println("Buku berhasil dihapus");
            return;
        }

        // Hapus node tengah
        prev.setNext(current.getNext());

        System.out.println("Buku berhasil dihapus");
    }

    public int jumlahBuku() {
        int jumlah = 0;
        Node pointer = head;
        while (pointer != null) {
            jumlah++;
            pointer = pointer.getNext();
        }
        return jumlah;
    }
}
