class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Employee Details -> ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create multiple Employee objects
        Employee e1 = new Employee(101, "Alice", 50000);
        Employee e2 = new Employee(102, "Bob", 60000);
        Employee e3 = new Employee(103, "Charlie", 70000);

        // Print employee details and class name
        System.out.println(e1);
        System.out.println("Class Name: " + e1.getClass().getName() + "\n");

        System.out.println(e2);
        System.out.println("Class Name: " + e2.getClass().getName() + "\n");

        System.out.println(e3);
        System.out.println("Class Name: " + e3.getClass().getName());
    }
}
