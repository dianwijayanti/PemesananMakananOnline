import java.util.Scanner;
    public class login {
        static User users = new User();
        static Scanner input = new Scanner(System.in);
        public static boolean Logins() {
            boolean login = false;
            users.setUsername("ADMIN");
            users.setPassword("123");

            users.setUsername_cust("CUSTOMER");
            users.setPassword_cust("456");

            String username, password;
            System.out.println("========================================================");
            System.out.println("LOG IN RESTORAN\n");
            System.out.print("Masukkan Username : ");
            username = input.nextLine();
            System.out.print("Masukkan Pass : ");
            password = input.nextLine();
            System.out.println("========================================================\n");

            if (users.getUsername().equals(username) || users.getUsername_cust().equals(username)) {
                if (users.getPassword().equals(password)) {
                    users.setStatus("ADMIN");
                    login = true;
                } else if (users.getPassword_cust().equals(password)) {
                    users.setStatus("CUSTOMER");
                    login= true;
                }
            }
            return login;
        }
    }

