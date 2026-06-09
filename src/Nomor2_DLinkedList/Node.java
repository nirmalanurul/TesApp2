package Nomor2_DLinkedList;

public class Node {
    private Aktivitas data;
    private Node next;
    private Node prev;

    public Node(Aktivitas data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Aktivitas getData() {
        return data;
    }

    public void setData(Aktivitas data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
