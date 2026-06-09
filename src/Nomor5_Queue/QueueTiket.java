package Nomor5_Queue;

public class QueueTiket {

    private QueueNode front;
    private QueueNode rear;
    private int size;

    public QueueTiket() {
        front = null;
        rear = null;
        size = 0;
    }

    // ENQUEUE
    public void enqueue(PembeliTiket pembeli) {

        QueueNode nodeBaru =
                new QueueNode(pembeli);

        if (front == null) {

            front = nodeBaru;
            rear = nodeBaru;

        } else {

            rear.setNext(nodeBaru);

            rear = nodeBaru;
        }

        size++;

        System.out.println("Pembeli masuk antrean.");
    }

    // DEQUEUE
    public void dequeue() {

        if (front == null) {

            System.out.println("Antrean kosong!");
            return;
        }

        System.out.println(
                "Melayani: "
                        + front.getData().getNama()
        );

        front = front.getNext();

        if (front == null) {
            rear = null;
        }

        size--;
    }

    // PEEK
    public void peek() {

        if (front == null) {

            System.out.println("Antrean kosong!");
            return;
        }

        System.out.println("\n=== SEDANG DILAYANI ===");

        System.out.println(
                front.getData().getNomorAntrean()
                        + " | "
                        + front.getData().getNama()
                        + " | "
                        + front.getData().getJumlahTiket()
        );
    }

    // DISPLAY
    public void display() {

        if (front == null) {

            System.out.println("Antrean kosong!");
            return;
        }

        QueueNode pointer = front;

        System.out.println("\n=== DAFTAR ANTREAN ===");

        while (pointer != null) {

            System.out.println(
                    pointer.getData().getNomorAntrean()
                            + " | "
                            + pointer.getData().getNama()
                            + " | "
                            + pointer.getData().getJumlahTiket()
            );

            pointer = pointer.getNext();
        }
    }

    // SIZE
    public int getSize() {
        return size;
    }
}