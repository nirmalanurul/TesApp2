package Nomor1_SLinkedList;

public class Node {
    Buku data;
    Node next;

    public Buku getData() {
        return data;
    }

    public void setData(Buku data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}