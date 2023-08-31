import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambah");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih! Keluar dari kalkulator.");
                break;
            }

            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
                continue;
            }

            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            int hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    break;
                case 4:
                    if (angka2 == 0) {
                        System.out.println("Pembagian dengan nol tidak diizinkan.");
                        continue;
                    }
                    hasil = angka1 / angka2;
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
            }

            System.out.println("Hasil: " + hasil);
        }

        scanner.close();
    }
}