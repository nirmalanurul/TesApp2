package Nomor4_Stack;

import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        StackBrowser stack = new StackBrowser();
        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n=== MESIN WAKTU BROWSER ===");
            System.out.println("1. Kunjungi Halaman");
            System.out.println("2. Kembali");
            System.out.println("3. Lihat Halaman Saat Ini");
            System.out.println("4. Tampilkan Riwayat");
            System.out.println("5. Jumlah Halaman");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            pilih = scanner.nextInt();
            scanner.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("URL : ");
                    String url = scanner.nextLine();
                    System.out.print("Judul Halaman : ");
                    String judul = scanner.nextLine();
                    System.out.print("Waktu Kunjungan : ");
                    String waktu = scanner.nextLine();
                    stack.push(
                            new HalamanBrowser(
                                    url,
                                    judul,
                                    waktu
                            )
                    );
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println(
                            "Jumlah halaman : "
                                    + stack.getSize()
                    );
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;
            }
        } while (pilih != 6);
    }
}