import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, select;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("User Name:");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("Fatih") && password.equals("123")) {
                System.out.println("Hello, Welcome to FB Bank!");
                do {
                    System.out.println("1-Deposit\n2-Withdraw\n3-Check Balance\n4-Sign Out");
                    System.out.print("Please, Select the process you make: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Enter the amount of money: ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Enter the amount of money: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> System.out.println("Balance : " + balance);
                    }
                } while (select != 4);
                System.out.println("See you again. Have a nice day.");
                break;
            } else {
                right--;
                System.out.println("Wrong user name or password. Try Again.");
                switch (right) {
                    case 0 -> System.out.println("Your account has been blocked, please contact the bank.");
                    default -> System.out.println("your remaining right: " + right);
                }
            }
        }
    }
}