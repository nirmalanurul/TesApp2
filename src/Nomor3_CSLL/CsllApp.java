package Nomor3_CSLL;

import java.util.Scanner;

public class CsllApp {

    static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        int pilihMenu;
        do {
            System.out.println("\n1. Tambah Awal");
            System.out.println("2. Tambah Tengah");
            System.out.println("3. Tambah Akhir");
            System.out.println("4. Hapus Awal");
            System.out.println("5. Hapus Tengah");
            System.out.println("6. Hapus Akhir");
            System.out.println("7. Tampilkan Semua");
            System.out.println("8. Jumlah Lokasi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            pilihMenu = scanner.nextInt();
            scanner.nextLine();
            switch (pilihMenu) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Nama Tempat : ");
                    String tempat = scanner.nextLine();
                    System.out.print("Jam Tiba : ");
                    String jam = scanner.nextLine();
                    System.out.print("Catatan : ");
                    String catatan = scanner.nextLine();

                    LokasiPerjalanan lokasi =
                            new LokasiPerjalanan(
                                    tempat,
                                    jam,
                                    catatan
                            );

                    Node nodeBaru = new Node(lokasi);

                    if (pilihMenu == 1) {
                        list.addFirst(nodeBaru);
                    } else if (pilihMenu == 2) {
                        System.out.print(
                                "Masukkan setelah tempat mana : "
                        );
                        String cari = scanner.nextLine();
                        list.addMiddle(nodeBaru, cari);
                    } else {
                        list.addLast(nodeBaru);
                    }
                    break;

                    case 4:
                    list.removeFirst();
                    break;

                case 5:
                    System.out.print("Masukkan nama tempat yang ingin dihapus : ");
                    String hapus = scanner.nextLine();
                    list.removeMiddle(hapus);
                    break;

                case 6:
                    list.removeLast();
                    break;

                case 7:
                    list.displayData();
                    break;

                case 8:
                    System.out.println("Jumlah lokasi : " + list.getSize());
                    break;

                case 9:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihMenu != 0);
    }
}
