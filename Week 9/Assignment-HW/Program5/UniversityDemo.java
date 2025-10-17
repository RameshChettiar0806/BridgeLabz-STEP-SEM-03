class University {
    private String universityName = "TechVille University";

    // 🔹 Non-static Inner Class (Member Inner Class)
    class Department {
        private String departmentName;

        // Constructor
        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void showDetails() {
            // Inner class can access outer class fields directly
            System.out.println("University: " + universityName);
            System.out.println("Department: " + departmentName);
        }
    }

    // 🔹 Static Nested Class
    static class ExamCell {
        public static void conductExam() {
            System.out.println("ExamCell: Conducting University Exams...");
        }

        public static void publishResults() {
            System.out.println("ExamCell: Publishing Exam Results...");
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        // Create outer class object
        University uni = new University();

        // 🔹 Accessing Non-static Inner Class
        University.Department dept = uni.new Department("Computer Science");
        dept.showDetails();

        System.out.println();

        // 🔹 Accessing Static Nested Class (no outer object required)
        University.ExamCell.conductExam();
        University.ExamCell.publishResults();
    }
}
