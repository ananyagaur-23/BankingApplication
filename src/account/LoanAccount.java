package account;

import interfaces.AccountOperations;

public class LoanAccount extends Account implements AccountOperations {

    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Loan Account");
    }

    @Override
    public void deposit(double amount) {
        // In Loan account, deposit reduces loan balance
        balance -= amount;
    }

    @Override
    public void withdraw(double amount) {
        // You generally don't withdraw from a loan account
        System.out.println("Withdrawals not allowed from Loan Account.");
    }
}
