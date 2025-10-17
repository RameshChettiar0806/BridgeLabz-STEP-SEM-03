import java.util.ArrayList;
import java.util.List;

class Book implements Cloneable {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override clone() for deep copy of individual books
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

class Library implements Cloneable {
    List<Book> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(Book b) {
        books.add(b);
    }

    // Shallow clone: copies the reference to the same book list
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep clone: create a new list and clone each Book manually
    protected Library deepClone() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new ArrayList<>();
        for (Book b : this.books) {
            clonedLibrary.books.add((Book) b.clone());
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        return books.toString();
    }
}

public class LibraryCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create Library and add Books
        Library originalLibrary = new Library();
        originalLibrary.addBook(new Book("1984", "George Orwell"));
        originalLibrary.addBook(new Book("Brave New World", "Aldous Huxley"));

        // Shallow clone
        Library shallowCopy = (Library) originalLibrary.clone();

        // Deep clone
        Library deepCopy = originalLibrary.deepClone();

        System.out.println("=== Before Modification ===");
        System.out.println("Original Library: " + originalLibrary);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy: " + deepCopy);

        // Modify a book in shallow copy
        shallowCopy.books.get(0).title = "Animal Farm";

        System.out.println("\n=== After Modifying Shallow Copy ===");
        System.out.println("Original Library: " + originalLibrary); // affected (same reference)
        System.out.println("Shallow Copy: " + shallowCopy);         // shows change
        System.out.println("Deep Copy: " + deepCopy);               // unaffected

        // Modify a book in deep copy
        deepCopy.books.get(1).title = "Island";

        System.out.println("\n=== After Modifying Deep Copy ===");
        System.out.println("Original Library: " + originalLibrary); // unchanged
        System.out.println("Deep Copy: " + deepCopy);               // changed
    }
}
