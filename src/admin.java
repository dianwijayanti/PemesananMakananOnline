import java.util.Scanner;
    public class admin {
        private int pilihan;
        static Scanner input = new Scanner(System.in);
        static login logout = new login();
        static restoran tambah = new restoran();

        public void admin() {
            System.out.println("1. Lihat Restoran");
            System.out.println("2. Tambah Restoran");
            System.out.println("3. Hapus Resto");
            System.out.println("4. Kembali ke Login");
            pilihan = Integer.parseInt(input.nextLine());
            if (pilihan == 1) {
                tambah.showResto();
            } else if (pilihan == 2) {
                tambah.addResto();
            } else if (pilihan == 3) {
                tambah.deleteResto();
            } else if (pilihan == 4) {
                logout.Logins();
            } else {
                System.exit(0);
            }
        }
    }