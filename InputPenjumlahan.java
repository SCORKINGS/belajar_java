import java.util.Scanner;

public class InputPenjumlahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka1, angka2, hasil;

        System.out.print("Bilangan 1: ");
        angka1 = in.nextInt();

        System.err.print("Bilangan 2: ");
        angka2 = in.nextInt();

        hasil = angka1 * angka2;
        System.out.println("Hasil Penjumlahan: " + hasil);
    }

    
}