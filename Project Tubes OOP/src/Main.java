import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[][] data = {
                    {"Honda", "Beat", "15000000"},
                    {"Honda", "Vario 125 New", "22000000"},
                    {"Yamaha", "NMax", "25000000"},
                    {"Suzuki", "GSX-R150", "28000000"},
                    {"Yamaha", "Aerox", "27000000"}
            };

            System.out.println("SELAMAT DATANG DI Dealer Jaya MOTOR");
            System.out.println("==================================");

            // Menampilkan daftar motor
            System.out.println("\nDaftar motor:");
            for (int i = 0; i < data.length; i++) {
                System.out.println((i+1) + ". " + data[i][0] + " " + data[i][1] + " - Rp " + data[i][2]);
            }

            // Memilih motor
            System.out.print("\nMasukkan nomor motor yang ingin dibeli: ");
            int motor = input.nextInt() - 1;
            while (motor < 0 || motor >= data.length) {
                System.out.print("Nomor motor tidak valid, silakan masukkan nomor yang valid: ");
                motor = input.nextInt() - 1;
            }

            // Memasukkan jumlah pembelian
            System.out.print("Masukkan jumlah motor yang ingin dibeli: ");
            int jumlah = input.nextInt();

            // Menghitung total harga pembelian
            int harga = Integer.parseInt(data[motor][2]);
            int total = harga * jumlah;
            if (total >= 50000000) {
                int diskon = total / 10;
                total -= diskon;
                System.out.println("Selamat, Anda mendapatkan diskon 10%!");
                System.out.println("Diskon: Rp " + diskon);
            }

            // Menampilkan detail pembelian
            System.out.println("\nDetail Pembelian:");
            System.out.println("-------------------");
            System.out.println("Merk: " + data[motor][0]);
            System.out.println("Model: " + data[motor][1]);
            System.out.println("Harga: Rp " + harga);
            System.out.println("Jumlah: " + jumlah);
            System.out.println("Total: Rp " + total);
            System.out.println("-------------------");

            // Memilih metode pembayaran
            System.out.println("\nMetode Pembayaran:");
            System.out.println("1. Pembayaran Tunai");
            System.out.println("2. Pembayaran Rekening");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            // Proses pembayaran
            if (pilihan == 1) {
                System.out.println("Total pembayaran anda sebesar:" + total);
                System.out.println("\nTerima kasih telah berbelanja di Dealer Jaya MOTOR.");
                System.out.println("===============================================");
            } else if (pilihan == 2) {
                System.out.print("\nMasukkan Nama Bank: ");
                input.next();
                System.out.print("\nMasukkan Nomor Rekening:");
                String rekening = input.next();
                System.out.println("Terima kasih telah melakukan pembayaran melalui rekening " + rekening + ".");
                System.out.println("\nTerima kasih telah berbelanja di Dealer Jaya MOTOR.");
                System.out.println("===============================================");
            } else {
                System.out.println("\nPilihan tidak valid, silakan pilih kembali.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
