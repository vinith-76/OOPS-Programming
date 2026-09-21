class LibraryBook {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    public static void main(String[] args) {
        LibraryBook b1 =
            new LibraryBook("The Alchemist", "Paulo Coelho", 399);

        LibraryBook b2 =
            new LibraryBook("Wings of Fire", "A.P.J. Abdul Kalam", 299);

        LibraryBook b3 =
            new LibraryBook("Harry Potter", "J.K. Rowling", 499);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        LibraryBook.displayBookCount();
    }
}
