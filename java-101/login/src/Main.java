import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, resetPassword, defaultUserName = "Admin", defaultPassword = "123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("User Name: ");
        userName = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        if(userName.equals(defaultUserName) && password.equals(defaultPassword)){
            System.out.print("You Logged in.");
        } else{
            System.out.println("Do you want to reset your password? (yes || No)");
            resetPassword = scanner.nextLine();

            if(resetPassword.equals("yes")){
                System.out.print("Enter new password: ");
                password = scanner.nextLine();

                if(password.equals(defaultPassword)){
                    System.out.print("Error, 404!");
                } else {
                    System.out.print("Password changed!");
                }
            } else {
                System.out.print("Wrong password or user name!");
            }
        }
    }
}
