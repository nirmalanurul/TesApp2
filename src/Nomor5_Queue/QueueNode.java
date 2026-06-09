package Nomor5_Queue;

public class QueueNode {

    private PembeliTiket data;
    private QueueNode next;

    public QueueNode(PembeliTiket data) {
        this.data = data;
        this.next = null;
    }

    public PembeliTiket getData() {
        return data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}