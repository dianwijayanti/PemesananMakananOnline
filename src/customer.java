import java.util.Scanner;
public class customer {
        public int pilihan;
        static Scanner input = new Scanner(System.in);
        static login logout = new login();
        static restoran tambah = new restoran();
        static pesanan menu = new pesanan();

        public void customer() {
            System.out.println("1. Lihat Restoran");
            System.out.println("2. Buat Pesanan");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Kembali ke Login");
            pilihan = Integer.parseInt(input.nextLine());
            if (pilihan == 1) {
                tambah.showResto();
            } else if (pilihan == 2) {
                pesanan.addPesanan();
            } else if (pilihan == 3) {
                pesanan.showPesanan();
            } else if (pilihan == 4) {
                logout.Logins();
            } else {
                System.exit(0);
                }
            }
        }
