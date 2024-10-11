import java.util.Scanner;

public class Modifikasi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int durasi; 
        double totalPembayaran = 0; 
        final int TARIF_MOBIL = 3000; 
        final int TARIF_MOTOR = 2000; 
        final int TARIF_MAX = 12500; 

        while (true) {
            System.out.print("Masukkan durasi parkir (jam) atau 0 untuk keluar: ");
            durasi = sc.nextInt();

            if (durasi == 0) {
                break; 
            }
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor): ");
            int jenisKendaraan = sc.nextInt();
            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 1 atau 2.");
                continue; 
            }
            double pembayaran;
            if (durasi > 5) {
                pembayaran = TARIF_MAX;
            } else {
                pembayaran = (jenisKendaraan == 1) ? (TARIF_MOBIL * durasi) : (TARIF_MOTOR * durasi);
            }
            totalPembayaran += pembayaran;
            System.out.println("Total pembayaran untuk durasi " + durasi + " jam: Rp " + pembayaran);
        }
        System.out.println("Total pembayaran parkir keseluruhan: Rp " + totalPembayaran);
    }
}
