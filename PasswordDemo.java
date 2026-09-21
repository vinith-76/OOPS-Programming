class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

class PasswordDemo {
    static void checkPassword(String password)
            throws InvalidPasswordException {

        if (password.length() < 8) {
            throw new InvalidPasswordException(
                "Password must contain at least 8 characters."
            );
        }

        System.out.println("Valid password.");
    }

    public static void main(String[] args) {
        try {
            checkPassword("abc123");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
