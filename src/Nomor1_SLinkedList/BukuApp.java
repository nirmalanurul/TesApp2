package Nomor1_SLinkedList;

import java.util.Scanner;

public class BukuApp {
    static  SLinkedList buku = new SLinkedList();

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihanMenu;
        do {
            System.out.println("COBAIN GITHUB");
            System.out.println("\n=== MENU BUKU ===");
            System.out.println("1. Tambah Nomor Buku");
            System.out.println("2. Menghapus Buku");
            System.out.println("3. Melihat Banyak Buku");
            System.out.println("4. Menampilan Semua Buku Tersedia");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Menu : ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine();
            switch (pilihanMenu) {
                case 1: tambahData(); break;
                case 2: hapusData(); break;
                case 3: jumlahBuku(); break;
                case 4: tampilBuku(); break;
            }
        } while (pilihanMenu != 5);

    }

    static void tambahData() {
        Scanner scanner = new Scanner(System.in);
        String id;
        String judul;
        String penulis;
        System.out.println("\n=== Tambah Data ===");
        System.out.print("Id : ");
        id = scanner.nextLine();
        System.out.print("Judul : ");
        judul = scanner.nextLine();
        System.out.print("Penulis : ");
        penulis = scanner.nextLine();

        Buku dataBuku = new Buku(id, judul, penulis);
        Node nodeBaru = new Node();
        nodeBaru.setData(dataBuku);
        buku.addLast(nodeBaru);
        System.out.println("Data buku berhasil ditambahkan!");
    }

    static void hapusData() {
        Scanner scanner = new Scanner(System.in);
        String idCari;
        System.out.println("\n=== Hapus Data ===");
        System.out.print("Masukkan Id data yang ingin dihapus : ");
        idCari = scanner.nextLine();
        buku.removeMiddle(idCari);
    }

    static void jumlahBuku() {
        System.out.println("\n=== JUMLAH BUKU ===");
        System.out.println("Jumlah Buku Tersedia :  " + buku.jumlahBuku());
    }

    static void tampilBuku() {
        System.out.println("\n=== BUKU TERSEDIA ====");
        buku.display();
    }
}