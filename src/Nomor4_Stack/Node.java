package Nomor4_Stack;

public class Node {

    private HalamanBrowser data;
    private Node next;

    public Node(HalamanBrowser data) {
        this.data = data;
        this.next = null;
    }

    public HalamanBrowser getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}