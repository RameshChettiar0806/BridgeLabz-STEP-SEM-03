import java.util.HashSet;
import java.util.Objects;

class Employee {
    private String empCode;
    private String name;

    public Employee(String empCode, String name) {
        this.empCode = empCode;
        this.name = name;
    }

    // Two employees are equal when their empCode is equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empCode, employee.empCode);
    }

    // Hash code based on empCode (null-safe)
    @Override
    public int hashCode() {
        return Objects.hash(empCode);
    }

    // Readable representation
    @Override
    public String toString() {
        return "Employee{empCode='" + empCode + "', name='" + name + "'}";
    }
}

public class EmployeeAuth {
    public static void main(String[] args) {
        // 1. Create employees
        Employee e1 = new Employee("BL001", "Ritika");
        Employee e2 = new Employee("BL001", "Ritika S.");
        Employee e3 = new Employee("BL002", "Amit");

        // 2. Reference equality vs logical equality
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));

        // Print the objects (toString)
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);

        // 3. Test usage in a HashSet
        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        boolean addedE2 = set.add(e2); // should be false because empCode same as e1
        boolean addedE3 = set.add(e3); // should be true

        System.out.println("Added e2 to set? " + addedE2);
        System.out.println("Added e3 to set? " + addedE3);
        System.out.println("HashSet size: " + set.size());
        System.out.println("HashSet contents: " + set);
    }
}