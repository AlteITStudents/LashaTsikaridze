package Bank;

// Main class to test the bank account classes
public class Main {
    public static void main(String[] args) {
        DebitAccount myDebitAccount = new DebitAccount(100.0);
        myDebitAccount.deposit(50.0);
        myDebitAccount.withdraw(30.0);
        System.out.println("Debit Account Balance: " + myDebitAccount.getBalance());

        CreditAccount myCreditAccount = new CreditAccount(100.0, 200.0);
        myCreditAccount.deposit(50.0);
        myCreditAccount.withdraw(250.0);
        System.out.println("Credit Account Balance: " + myCreditAccount.getBalance());
    }
}
