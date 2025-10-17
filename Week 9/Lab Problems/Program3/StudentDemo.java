import java.util.HashSet;
import java.util.Objects;

class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() to compare based on 'id'
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        return this.id == other.id; // equality based on id only
    }

    // Override hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create HashSet to store Student objects
        HashSet<Student> students = new HashSet<>();

        // Create Student objects
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(101, "Charlie"); // same id as s1 → treated as duplicate

        // Add students to HashSet
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Print all students (duplicates avoided automatically)
        System.out.println("Students in HashSet:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
