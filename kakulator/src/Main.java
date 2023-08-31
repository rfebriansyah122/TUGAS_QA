import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Kalkulator");
        System.out.println("Pilih Pengoperasian:");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int choice = scanner.nextInt();

        int num1, num2;

        System.out.print("Masukkan Angka Pertama: ");
        num1 = scanner.nextInt();

        System.out.print("Masukkan Angka Kedua: ");
        num2 = scanner.nextInt();

        int hasil = 0;

        switch (choice) {
            case 1:
                hasil = Kalkulator.tambah(num1, num2);
                break;
            case 2:
                hasil = Kalkulator.kurang(num1, num2);
                break;
            case 3:
                hasil = Kalkulator.kali(num1, num2);
                break;
            case 4:
                hasil = Kalkulator.bagi(num1, num2);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
        System.out.println("Result: " + hasil);


        scanner.close();
    }
}