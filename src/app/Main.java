package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("-------------------------");
        System.out.println("Welcome to Console-Bank!!");
        System.out.println("-------------------------");
        while(running){
            System.out.println("""
                1. Open Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Account Transfer
                6. List Account
                7. Search Accounts by Customer Name
                0. Exit
                """);
            System.out.println("Choose Options to Proceed: ");
            String choice = scanner.nextLine().trim();
            System.out.println("CHOICE : "+choice);
            switch (choice){
                case "1" -> openAccount(scanner);
                case "2" -> deposit(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> statement(scanner);
                case "6" -> listAccount(scanner);
                case "7" -> searchAccount(scanner);
                case "0" -> running = false;
            }
        }


    }

    private static void openAccount(Scanner scanner) {
        System.out.println("Customer name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Customer email: ");
        String email = scanner.nextLine().trim();
        System.out.println("Account Type (SAVINGS/CURRENT): ");
        String type = scanner.nextLine().trim();
        System.out.println("Initial Deposit (optional, left blank for 0): ");
        String amountStr = scanner.nextLine().trim();
        Double initial = Double.valueOf(amountStr);
    }

    private static void deposit(Scanner scanner) {
    }

    private static void withdraw(Scanner scanner) {
    }

    private static void transfer(Scanner scanner) {
    }

    private static void statement(Scanner scanner) {
    }

    private static void listAccount(Scanner scanner) {
    }

    private static void searchAccount(Scanner scanner) {
    }


}