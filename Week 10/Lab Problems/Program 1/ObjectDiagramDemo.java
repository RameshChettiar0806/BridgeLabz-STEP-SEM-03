class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

class Teacher {
    String name;
    String subject;
    Student student1;
    Student student2;

    Teacher(String name, String subject, Student s1, Student s2) {
        this.name = name;
        this.subject = subject;
        this.student1 = s1;
        this.student2 = s2;
    }

    void display() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject);
        System.out.println("Guides Students:");
        student1.display();
        student2.display();
        System.out.println("--------------------------------------");
    }
}

public class ObjectDiagramDemo {
    public static void main(String[] args) {

        // Create Student objects
        Student student1 = new Student("Karthik", 101);
        Student student2 = new Student("Anjali", 102);
        Student student3 = new Student("Rahul", 103);
        Student student4 = new Student("Meera", 104);

        // Create Teacher objects guiding two students each
        Teacher teacher1 = new Teacher("Mr. Sharma", "Mathematics", student1, student2);
        Teacher teacher2 = new Teacher("Mrs. Priya", "Science", student3, student4);

        // Display object relationships
        System.out.println("=== Object Diagram Representation ===\n");
        teacher1.display();
        teacher2.display();
    }
}
