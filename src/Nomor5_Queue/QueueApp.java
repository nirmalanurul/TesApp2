package Nomor5_Queue;

import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {

        QueueTiket queue =
                new QueueTiket();

        Scanner scanner = new Scanner(System.in);

        int pilih;

        do {

            System.out.println("\n=== ANTREAN TIKET KONSER ===");
            System.out.println("1. Tambah Pembeli");
            System.out.println("2. Layani Pembeli");
            System.out.println("3. Lihat Pembeli Terdepan");
            System.out.println("4. Tampilkan Semua Antrean");
            System.out.println("5. Jumlah Antrean");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            pilih = scanner.nextInt();
            scanner.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nomor Antrean : ");
                    int nomor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("Jumlah Tiket : ");
                    int tiket = scanner.nextInt();

                    queue.enqueue(
                            new PembeliTiket(
                                    nomor,
                                    nama,
                                    tiket
                            )
                    );
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println(
                            "Jumlah antrean : "
                                    + queue.getSize()
                    );
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;
            }

        } while (pilih != 6);
    }
}
