import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int tarifkwh = 1500;
        int batasPenggunaan = 500;
        Scanner scanner  = new Scanner (System.in);
        System.out.print("Masukkan jumlah listrik (kwh): ");
        double penggunaanKwh = scanner.nextDouble();
        double totalTagihan = penggunaanKwh * tarifkwh;
        boolean melebihiBatas = penggunaanKwh > batasPenggunaan ;
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("penggunaan listrik " + (melebihiBatas));
    }
}