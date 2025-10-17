import java.util.UUID;

public class LibrarySystem {

    // --------- Book Class ---------
    static class Book {
        private String bookId;
        private String title;
        private String author;
        private boolean isAvailable;

        private static int totalBooks = 0;
        private static int availableBooks = 0;

        // Constructor
        public Book(String title, String author) {
            this.bookId = generateBookId();
            this.title = title;
            this.author = author;
            this.isAvailable = true;
            totalBooks++;
            availableBooks++;
        }

        // Issue the book
        public boolean issueBook() {
            if (isAvailable) {
                isAvailable = false;
                availableBooks--;
                return true;
            } else {
                System.out.println(title + " is currently not available.");
                return false;
            }
        }

        // Return the book
        public void returnBook() {
            if (!isAvailable) {
                isAvailable = true;
                availableBooks++;
            }
        }

        // Display book info
        public void displayBookInfo() {
            System.out.println("Book ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
        }

        // Generate unique book ID
        public static String generateBookId() {
            return "B-" + UUID.randomUUID().toString().substring(0, 8);
        }

        // Getters
        public String getBookId() {
            return bookId;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        // Static stats
        public static void displayStats() {
            System.out.println("Total Books: " + totalBooks + " | Available Books: " + availableBooks);
        }
    }

    // --------- Member Class ---------
    static class Member {
        private String memberId;
        private String memberName;
        private String[] booksIssued;
        private int bookCount;

        // Constructor
        public Member(String memberName, int maxBooks) {
            this.memberId = generateMemberId();
            this.memberName = memberName;
            this.booksIssued = new String[maxBooks];
            this.bookCount = 0;
        }

        // Borrow a book
        public void borrowBook(Book book) {
            if (bookCount >= booksIssued.length) {
                System.out.println(memberName + " cannot borrow more books.");
                return;
            }
            if (book.issueBook()) {
                booksIssued[bookCount] = book.getBookId();
                bookCount++;
                System.out.println(memberName + " borrowed " + book.getBookId());
            }
        }

        // Return a book by bookId
        public void returnBook(String bookId, Book[] books) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookId().equals(bookId)) {
                    for (int j = 0; j < bookCount; j++) {
                        if (booksIssued[j].equals(bookId)) {
                            books[i].returnBook();
                            booksIssued[j] = booksIssued[bookCount - 1]; // Shift last book to current
                            booksIssued[bookCount - 1] = null;
                            bookCount--;
                            System.out.println(memberName + " returned " + bookId);
                            return;
                        }
                    }
                }
            }
            System.out.println(memberName + " did not borrow book " + bookId);
        }

        // Display member info
        public void displayMemberInfo() {
            System.out.print("Member ID: " + memberId + " | Name: " + memberName + " | Books Issued: ");
            for (int i = 0; i < bookCount; i++) {
                System.out.print(booksIssued[i] + " ");
            }
            System.out.println();
        }

        // Generate unique member ID
        public static String generateMemberId() {
            return "M-" + UUID.randomUUID().toString().substring(0, 8);
        }
    }

    // --------- Main Method ---------
    public static void main(String[] args) {
        // Create books
        Book[] books = new Book[3];
        books[0] = new Book("1984", "George Orwell");
        books[1] = new Book("The Hobbit", "J.R.R. Tolkien");
        books[2] = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create members
        Member[] members = new Member[2];
        members[0] = new Member("Alice", 2);
        members[1] = new Member("Bob", 3);

        // Borrow books
        members[0].borrowBook(books[0]);
        members[0].borrowBook(books[1]);
        members[0].borrowBook(books[2]); // Should fail (max 2 books)

        members[1].borrowBook(books[2]); // Should succeed

        // Display info
        System.out.println("\n--- Books Info ---");
        for (Book b : books) b.displayBookInfo();
        Book.displayStats();

        System.out.println("\n--- Members Info ---");
        for (Member m : members) m.displayMemberInfo();

        // Return books
        members[0].returnBook(books[0].getBookId(), books);
        members[1].returnBook(books[1].getBookId(), books); // Not borrowed

        System.out.println("\n--- After Returning Books ---");
        for (Book b : books) b.displayBookInfo();
        Book.displayStats();

        for (Member m : members) m.displayMemberInfo();
    }
}
