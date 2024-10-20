package Bank;

class BankAccount {
    private double balance; 

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }
}


class DebitAccount extends BankAccount {
    public DebitAccount(double initialBalance) {
        super(initialBalance); 
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.deposit(-amount);
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}


class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(double initialBalance, double creditLimit) {
        super(initialBalance);
        this.creditLimit = creditLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + creditLimit) >= amount) {
            super.deposit(-amount); 
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal exceeds credit limit or invalid amount.");
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}

