import java.util.HashSet;
import java.util.Objects;

class Student {
    private int rollNo;
    private String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Override equals() to compare students by rollNo
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // same reference

        if (obj == null || getClass() != obj.getClass())
            return false; // null or different class

        Student other = (Student) obj;
        return this.rollNo == other.rollNo; // equal if rollNo is same
    }

    // Override hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    // toString() for readable display
    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create a HashSet to store students
        HashSet<Student> students = new HashSet<>();

        // Create Student objects
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(1, "Charlie"); // same rollNo as s1 → duplicate by logic

        // Add students to HashSet
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Display all students in the HashSet
        System.out.println("Students in HashSet:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
