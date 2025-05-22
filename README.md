# Java Banking Application

This is a simple console-based Java Banking Application demonstrating core Object-Oriented Programming (OOP) principles including abstraction, inheritance, interfaces, and polymorphism. The application supports different bank types and account types.

## Features

- Open accounts in Nationalized or Cooperative banks  
- Support for Savings, Current, and Loan accounts  
- Deposit and withdraw funds  
- Display bank and account details

## Use Case Scenarios

1. **Open Account**  
   - Select bank type and account type  
   - Account is created with a unique number  

2. **Deposit Amount**  
   - Provide account number and amount  
   - Validates account and adds balance  

3. **Withdraw Amount**  
   - Provide account number and amount  
   - Checks balance before deduction  

4. **Display Details**  
   - List accounts for a bank with holder name, account number, type, and balance  

## Technologies Used

- Java 17  
- Console I/O  
- Object-Oriented Programming  

## Folder Structure

- `Account.java` – Abstract base class  
- `SavingsAccount.java`, `CurrentAccount.java`, `LoanAccount.java` – Account types  
- `Bank.java` – Abstract class for banks  
- `CooperativeBank.java` – Bank implementation  
- `AccountOperations.java` – Interface for banking operations  
- `BankApp.java` – Main driver class  
- `module-info.java` – Java module declaration  

## How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/your-repo-name

### What to Do With This

This project is designed for Java beginners to understand and practice core OOP concepts through a hands-on banking system. Here's what you can do with it:

- 🛠 **Learn Java OOP**  
  Explore how abstraction, inheritance, interfaces, and method overriding are applied in real-world scenarios.

- 💡 **Enhance It**  
  Add new features like:
  - User authentication
  - Interest calculation for savings/loan accounts
  - File/database storage for account persistence

- 🔍 **Use for College Projects**  
  This is a great starting point for mini-projects or OOP assignments.

- 📚 **Practice Git & GitHub**  
  Use this as a base to practice version control, commits, branching, and pushing to GitHub.

- 🚀 **Convert to GUI/App**  
  Try refactoring it into a Swing or JavaFX application to enhance your UI skills.
