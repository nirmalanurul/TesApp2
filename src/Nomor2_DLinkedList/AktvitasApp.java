package Nomor2_DLinkedList;

import java.util.Scanner;

public class AktvitasApp {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DLinkedList list = new DLinkedList();
        int pilihanMenu;
        do {
            System.out.println("\n=== APLIKASI PELACAK AKTIVITAS ===");
            System.out.println("1. Tambah Aktivitas Awal");
            System.out.println("2. Tambah Aktivitas Akhir");
            System.out.println("3. Tambah Aktivitas Berdasarkan Waktu");
            System.out.println("4. Hapus Aktivitas Awal");
            System.out.println("5. Hapus Aktivitas Akhir");
            System.out.println("6. Hapus Aktivitas Berdasarkan Waktu");
            System.out.println("7. Lihat Jumlah Aktivitas");
            System.out.println("8. Lihat Daftar Semua Aktivitas");
            System.out.println("9. Keluar");
            System.out.print("Pilihan Menu : ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine();
            switch (pilihanMenu) {
                case 1:
                case 2:
                case 3:
                    System.out.println("\n=== TAMBAH AKTIVITAS ===");
                    System.out.print("Waktu : ");
                    String waktu = scanner.nextLine();
                    System.out.print("Deskripsi : ");
                    String deskripsi = scanner.nextLine();
                    System.out.print("Lokasi : ");
                    String lokasi = scanner.nextLine();
                    Aktivitas aktivitas = new Aktivitas(waktu, deskripsi, lokasi);
                    Node nodeBaru = new Node(aktivitas);
                    if (pilihanMenu == 1) {
                        list.addFirst(nodeBaru);
                    } else if (pilihanMenu == 3) {
                        System.out.print("Masukkan waktu aktivitas setelah data mana : ");
                        String waktuDicari = scanner.nextLine();
                        list.addMiddle(nodeBaru, waktuDicari);
                    } else {
                        list.addLast(nodeBaru);
                    }
                    break;
                case 4:
                    System.out.println("\n=== HAPUS AKTIVITAS ===");
                    list.removeFirst();
                    break;
                case 5:
                    System.out.println("\n=== HAPUS AKTIVITAS ===");
                    list.removeLast();
                    break;
                case 6:
                    System.out.println("\n=== HAPUS AKTIVITAS ===");
                    System.out.print("Masukkan waktu aktivitas dihapus : ");
                    String waktuDicari = scanner.nextLine();
                    list.removeMiddle(waktuDicari);
                    break;
                case 7:
                    System.out.println("\n=== JUMLAH AKTIVITAS ===");
                    System.out.println("Jumlah Data : " + list.getSize());
                    break;
                case 8:
                    System.out.println("\n=== DAFTAR AKTIVITAS ===");
                    list.displayForward();
                    break;
            }
        } while (pilihanMenu != 9);
    }
}
