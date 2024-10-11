import java.util.Scanner;

public class Modifikasi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiket = 0;
        int totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau -1 untuk keluar): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang valid.");
                continue;
            }
            double hargaTiket = HARGA_TIKET * jumlahTiket;
            if (jumlahTiket > 10) {
                hargaTiket *= 0.85;
            } else if (jumlahTiket > 4) {
                hargaTiket *= 0.90;
            }
            totalTiket += jumlahTiket;
            totalPendapatan += hargaTiket;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + hargaTiket);
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan penjualan tiket: Rp " + totalPendapatan);
    }
}
