import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(double initialBalance) {
        this.account = new BankAccount(initialBalance);
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the ATM");
        boolean done = false;
        while (!done) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = readIntInRange(1, 4);
            switch (choice) {
                case 1:
                    System.out.printf("Current balance: ₹%.2f%n", account.getBalance());
                    break;
                case 2:
                    handleDeposit();
                    break;
                case 3:
                    handleWithdraw();
                    break;
                case 4:
                    done = true;
                    System.out.println("Thank you! Goodbye.");
            }
        }
    }

    private int readIntInRange(int min, int max) {
        while (true) {
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Please enter a number between " + min + " and " + max + ": ");
                continue;
            }
            int val = scanner.nextInt();
            if (val < min || val > max) {
                System.out.print("Enter a number between " + min + " and " + max + ": ");
                continue;
            }
            return val;
        }
    }

    private double readPositiveDouble() {
        while (true) {
            if (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.print("Invalid amount. Try again: ");
                continue;
            }
            double val = scanner.nextDouble();
            if (val <= 0) {
                System.out.print("Amount must be positive. Try again: ");
                continue;
            }
            return val;
        }
    }

    private void handleDeposit() {
        System.out.print("Enter deposit amount: ₹");
        double amt = readPositiveDouble();
        if (account.deposit(amt)) {
            System.out.printf("Deposited ₹%.2f successfully.%n", amt);
            System.out.printf("New balance: ₹%.2f%n", account.getBalance());
        } else {
            System.out.println("Deposit failed.");
        }
    }

    private void handleWithdraw() {
        System.out.print("Enter withdrawal amount: ₹");
        double amt = readPositiveDouble();
        if (account.withdraw(amt)) {
            System.out.printf("Withdrew ₹%.2f successfully.%n", amt);
            System.out.printf("New balance: ₹%.2f%n", account.getBalance());
        } else {
            System.out.println("Withdrawal failed: insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000.00); // starting balance
        atm.start();
    }
}
