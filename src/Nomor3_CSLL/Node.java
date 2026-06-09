package Nomor3_CSLL;

public class Node {
    private LokasiPerjalanan data;
    private Node next;

    public Node(LokasiPerjalanan data) {
        this.data = data;
        this.next = null;
    }

    public LokasiPerjalanan getData() {
        return data;
    }

    public void setData(LokasiPerjalanan data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
