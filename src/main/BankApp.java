package main;

import java.util.*;

import account.*;
import bank.*;
import interfaces.AccountOperations;

public class BankApp {
    private static Scanner sc = new Scanner(System.in);
    private static Bank bank = new NationalizedBank("SBI", "CG");
    private static int accountCounter = 100;
    private static Map<String, AccountOperations> accountMap = new HashMap<>();
    

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n----- Banking Menu -----");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Bank and Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    openAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    bank.displayBankInfo();
                    break;
                case 5:
                    System.out.println("Exiting app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    private static void openAccount() {
        System.out.print("Enter account type (Savings/Current/Loan): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        String accNo = "ACC" + (++accountCounter);
        AccountOperations account = null;
        Account accountObj = null;

        switch (type) {
            case "savings":
                account = new SavingsAccount(accNo, name, balance);
                break;
            case "current":
                account = new CurrentAccount(accNo, name, balance);
                break;
            case "loan":
                account = new LoanAccount(accNo, name, balance);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }

        accountObj = (Account) account;
        bank.openAccount(accountObj);
        accountMap.put(accNo, account);

        System.out.println("Account created successfully. Account Number: " + accNo);
    }
}