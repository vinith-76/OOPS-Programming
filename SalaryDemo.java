class InvalidSalaryException extends Exception {
    InvalidSalaryException(String message) {
        super(message);
    }
}

class SalaryDemo {
    static void checkSalary(double salary)
            throws InvalidSalaryException {

        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative.");
        }

        System.out.println("Valid salary: Rs." + salary);
    }

    public static void main(String[] args) {
        try {
            checkSalary(-5000);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
