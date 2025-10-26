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
                case "0" -> running = false;
            }
        }


    }
}