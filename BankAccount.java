class BankAccount {
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountHolderName = "Rahul";
        account.balance = 5000;

        System.out.println("Account Holder: " + account.accountHolderName);
        account.checkBalance();

        account.deposit(2000);
        account.checkBalance();

        account.withdraw(1500);
        account.checkBalance();
    }
}
