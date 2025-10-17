import java.util.*;

class Book {
    // TODO: Declare private attributes: title, author, isbn
    private String title;
    private String author;
    private String isbn;

    // TODO: Create a parameterized constructor to initialize all attributes
    public Book(String title, String author, String isbn) {
        // TODO: Initialize fields
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // TODO: Create a method to show details of the book
    public void showDetails() {
        // TODO: Print book information in format:
        // "Title: <title>, Author: <author>, ISBN: <isbn>"
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    // TODO: Create a getter method to return the book title
    public String getTitle() {
        // TODO: Return title
        return title;
    }
}

class Library {
    // TODO: Declare private attributes: name (String), books (List<Book>)
    private String name;
    private List<Book> books;

    // TODO: Create a constructor to initialize the library name and list
    public Library(String name) {
        // TODO: Initialize fields
        this.name = name;
        this.books = new ArrayList<>();
    }

    // TODO: Add a book to the library
    public void addBook(Book book) {
        // TODO: Add the book to the list
        books.add(book);
        // Print: "Added book '<title>' to <libraryName> Library"
        System.out.println("Added book '" + book.getTitle() + "' to " + name + " Library");
    }

    // TODO: Display all books in the library
    public void showBooks() {
        // TODO: Print "Books in <libraryName> Library:"
        System.out.println("Books in " + name + " Library:");
        // Loop through books and call showDetails() for each Book
        for (Book b : books) {
            b.showDetails();
        }
    }
}

class Member {
    // TODO: Declare private attributes: name (String), borrowedBooks (List<Book>)
    private String name;
    private List<Book> borrowedBooks;

    // TODO: Create a constructor to initialize the member name and list
    public Member(String name) {
        // TODO: Initialize fields
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // TODO: Borrow a book from the library
    public void borrowBook(Book book) {
        // TODO: Add the book to the borrowedBooks list
        borrowedBooks.add(book);
        // Print: "<memberName> borrowed book: <bookTitle>"
        System.out.println(name + " borrowed book: " + book.getTitle());
    }

    // TODO: Show all borrowed books
    public void showBorrowedBooks() {
        // TODO: Print "Books borrowed by <memberName>:"
        System.out.println("Books borrowed by " + name + ":");
        // Loop through borrowedBooks and call showDetails() for each
        for (Book b : borrowedBooks) {
            b.showDetails();
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        // TODO: Step 1 - Create a Library object
        // Example: Library lib = new Library("Central City");
        Library lib = new Library("Central City");

        // TODO: Step 2 - Create 3 Book objects with sample data
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book b3 = new Book("1984", "George Orwell", "9780451524935");

        // TODO: Step 3 - Add books to library using addBook()
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        // TODO: Step 4 - Display all books in the library using showBooks()
        lib.showBooks();

        // TODO: Step 5 - Create a Member object (e.g., new Member("Ravi"))
        Member member = new Member("Ravi");

        // TODO: Step 6 - Borrow 2 books using borrowBook()
        member.borrowBook(b1);
        member.borrowBook(b3);

        // TODO: Step 7 - Display borrowed books using showBorrowedBooks()
        member.showBorrowedBooks();
    }
}