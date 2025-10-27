import java.util.*;

class Book {
    String title;
    String author;
    String ISBN;
    boolean isIssued;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = false;
    }

    void issueBook() { isIssued = true; }
    void returnBook() { isIssued = false; }
}

class Member {
    String name;
    int memberId;
    List<Book> issuedBooks = new ArrayList<>();

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void borrowBook(Book b) {
        issuedBooks.add(b);
        b.issueBook();
    }

    void returnBook(Book b) {
        issuedBooks.remove(b);
        b.returnBook();
    }

    void showBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        for (Book b : issuedBooks) {
            System.out.println(" - " + b.title);
        }
    }
}

class Librarian {
    String name;
    int employeeId;
    List<Member> members = new ArrayList<>();

    Librarian(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void addMember(Member m) { members.add(m); }
    void viewAllMembers() {
        System.out.println("Members managed by " + name + ":");
        for (Member m : members) {
            System.out.println(" - " + m.name);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create Books
        Book b1 = new Book("Java Basics", "James Gosling", "J101");
        Book b2 = new Book("Data Structures", "Robert Lafore", "D102");

        // Create Members
        Member m1 = new Member("Karthik", 1);
        Member m2 = new Member("Anjali", 2);

        // Librarian manages members (aggregation)
        Librarian lib = new Librarian("Mrs. Priya", 101);
        lib.addMember(m1);
        lib.addMember(m2);

        // Member borrows books (association)
        m1.borrowBook(b1);
        m2.borrowBook(b2);

        // Display relationships
        lib.viewAllMembers();
        m1.showBorrowedBooks();
        m2.showBorrowedBooks();
    }
}
