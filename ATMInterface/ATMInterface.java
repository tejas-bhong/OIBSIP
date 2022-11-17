import java.util.Objects;
import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        String registeredUsername, username;
        String registeredPassword, password;
        int choice;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Registration");

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your username: ");
        registeredUsername = scanner.next();

        System.out.println("Enter your password: ");
        registeredPassword = scanner.next();

        System.out.println("Registered Successfully");

        do {

            System.out.println("Enter your choice: ");
            System.out.println("1. Login to your account");
            System.out.println("2. Exit");
            choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("Enter your username");
                username = scanner.next();

                System.out.println("Enter your password");
                password = scanner.next();

                if (Objects.equals(username, registeredUsername) && Objects.equals(password, registeredPassword)) {

                    System.out.println("Welcome " + name);
                    while (choice != 4) {

                        System.out.println("Select choice");
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdraw");
                        System.out.println("3.View balance");
                        System.out.println("4.Exit");
                        choice = scanner.nextInt();
                        switch (choice) {

                            case 1 -> {

                                System.out.println("Enter amount to deposit:");
                                int depositAmount = scanner.nextInt();
                                balance += depositAmount;
                            }
                            case 2 -> {

                                System.out.println("Enter amount to withdraw:");
                                int withdrawAmount = scanner.nextInt();
                                if (balance >= withdrawAmount) {

                                    balance -= withdrawAmount;
                                } else {

                                    System.out.println("Insufficient balance");
                                }
                            }
                            case 3 -> System.out.println("Your balance is: " + balance);
                            case 4 -> System.out.println("Thank you");
                            default -> System.out.println("Invalid choice");
                        }
                    }
                } else {

                    System.out.println("Incorrect password");
                    System.out.println("Try again");
                }
            } else if (choice != 2) {

                System.out.println("Invalid choice");
            }
        } while (choice != 2);
        System.out.println("Thank you");
    }
}
