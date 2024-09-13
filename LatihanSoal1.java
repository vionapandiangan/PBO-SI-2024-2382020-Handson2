import java.util.Scanner;

public class LatihanSoal1 {
}import java.util.Scanner; // Perbaikan: Scanner dengan huruf besar dan ditambah tanda ';'

public class LatihanSoal1 {
    public static void main(String[] args) {
        // Membuat Scanner untuk mengambil input dari user
        Scanner input = new Scanner(System.in);

        // Meminta input dari user
        System.out.println("Masukkan angka pertama: ");
        double num1 = input.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double num2 = input.nextDouble();

        // Menentukan nilai yang paling besar
        if (num1 > num2) {
            System.out.println("Nilai terbesar adalah: " + num1);
        } else if (num2 > num1) {
            System.out.println("Nilai terbesar adalah: " + num2);
        } else {
            System.out.println("Kedua angka sama besar.");
        }

        // Menutup Scanner
        input.close();
    }
}

