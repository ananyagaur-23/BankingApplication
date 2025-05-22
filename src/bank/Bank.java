package bank;

import account.Account;

public abstract class Bank {
    protected String bankName;
    protected String branchName;
    protected static final String BANK_CODE_PREFIX = "BANK-";
    private static int bankCounter = 1;
    protected String bankCode;

    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.bankCode = generateBankCode();
    }

    public abstract void openAccount(Account account);
    public abstract void displayBankInfo();

    protected String generateBankCode() {
        return BANK_CODE_PREFIX + String.format("%03d", bankCounter++);
    }
}
