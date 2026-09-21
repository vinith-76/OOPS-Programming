class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BalanceDemo {
    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        double balance = 5000;
        double amount = 7000;

        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
