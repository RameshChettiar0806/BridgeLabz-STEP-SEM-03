/*
 * Design a library system with different types of users:
● Students can borrow books and access computers
● Faculty can reserve books and access research databases
● Guests can only browse books
Create a general "LibraryUser" system that can handle any user type for common
operations like entry logging and basic info display.
Hint: Think bigger picture - store specialists as generalists safely!
 */

import java.util.*;

class LibraryUser {
    protected String name;
    protected String userType;

    public LibraryUser(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    public void logEntry() {
        System.out.println(name + " (" + userType + ") entered the library.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Type: " + userType);
    }

    // Common operation: browse books
    public void browseBooks() {
        System.out.println(name + " is browsing books.");
    }
}

class Student extends LibraryUser {
    public Student(String name) {
        super(name, "Student");
    }

    public void borrowBook(String book) {
        System.out.println(name + " borrowed the book: " + book);
    }

    public void accessComputer() {
        System.out.println(name + " is accessing a computer.");
    }
}

class Faculty extends LibraryUser {
    public Faculty(String name) {
        super(name, "Faculty");
    }

    public void reserveBook(String book) {
        System.out.println(name + " reserved the book: " + book);
    }

    public void accessResearchDatabase() {
        System.out.println(name + " is accessing research databases.");
    }
}

class Guest extends LibraryUser {
    public Guest(String name) {
        super(name, "Guest");
    }

    // Guests have only browseBooks, inherited from LibraryUser
}

public class UniversityLibrarySystem {
    private List<LibraryUser> users = new ArrayList<>();

    public void addUser(LibraryUser user) {
        users.add(user);
        user.logEntry();
    }

    public void displayAllUsers() {
        System.out.println("\nLibrary Users:");
        for (LibraryUser user : users) {
            user.displayInfo();
        }
    }

    public static void main(String[] args) {
        UniversityLibrarySystem system = new UniversityLibrarySystem();

        // Create users
        Student s1 = new Student("Amar");
        Faculty f1 = new Faculty("Akbar");
        Guest g1 = new Guest("Anthony");

        // Add users to system
        system.addUser(s1);
        system.addUser(f1);
        system.addUser(g1);

        // Common operations
        s1.browseBooks();
        f1.browseBooks();
        g1.browseBooks();

        // Specialist operations
        s1.borrowBook("Java Programming");
        s1.accessComputer();

        f1.reserveBook("Data Structures");
        f1.accessResearchDatabase();

        // Display all users
        system.displayAllUsers();
    }
}