class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override equals() for content comparison
    @Override
    public boolean equals(Object obj) {
        // Check if both references point to same object
        if (this == obj)
            return true;

        // Check if obj is an instance of Book
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Typecast obj and compare fields
        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = book1; // Same reference as book1

        // == compares references
        System.out.println("book1 == book2: " + (book1 == book2));  // false
        System.out.println("book1 == book3: " + (book1 == book3));  // true

        // equals() compares content
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // true
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // true
    }
}
