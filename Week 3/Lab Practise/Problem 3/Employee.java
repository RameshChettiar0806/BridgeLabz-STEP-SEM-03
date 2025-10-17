/*a. Create an Employee class with private variables: empId (String), empName (String),
department (String), baseSalary (double), empType (String), and static variable
totalEmployees (int)
b. Create multiple constructors for different employee types: constructor for full-time
employees, constructor for part-time employees, constructor for contract employees
c. Create overloaded methods calculateSalary(): one for full-time (base salary +
bonus), one for part-time (hourly rate × hours), one for contract (fixed amount)
d. Create overloaded methods calculateTax() with different tax rates for different
employee types
e. Create methods generatePaySlip() to display employee details with calculated
salary and tax, displayEmployeeInfo() for formatted output
f. Create static methods to track total employees and generate company-wide payroll
reports
g. In main, create different types of employee objects, demonstrate method overloading
by calling the same method names with different parameters */
public class Employee{
    private String empId;
    private String empName;
    private String department;
    private double baseSalary;
    private String empType;
    private static int totalEmployees = 0;
    private double hourlyRate;
    private int hoursWorked;
    private double contractAmount;

    // Constructor for full-time employees
    public Employee(String empName, String department, double baseSalary, String empType) {
        this.empId = generateEmpId();
        this.empName = empName;
        this.department = department;
        this.baseSalary = baseSalary;
        this.empType = empType;
        totalEmployees++;
    }

    // Constructor for part-time employees
    public Employee(String empName, String department, double hourlyRate, int hoursWorked) {
        this.empId = generateEmpId();
        this.empName = empName;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.empType = "Part-Time";
        totalEmployees++;
    }

    // Constructor for contract employees
    public Employee(String empName, String department, double contractAmount) {
        this.empId = generateEmpId();
        this.empName = empName;
        this.department = department;
        this.contractAmount = contractAmount;
        this.empType = "Contract";
        totalEmployees++;
    }

    // Method to calculate salary for full-time employees
    public double calculateSalary(double bonus) {
        return baseSalary + bonus;
    }

    // Method to calculate salary for part-time employees
    public double calculateSalary() {
        if ("Part-Time".equals(empType)) {
            return hourlyRate * hoursWorked;
        } else if ("Contract".equals(empType)) {
            return contractAmount;
        } else {
            return baseSalary;
        }
    }

    // Method to calculate tax for full-time employees
    public double calculateTax(double bonus) {
        return (baseSalary + bonus) * 0.3;
    }

    // Method to calculate tax for part-time employees
    public double calculateTax() {
        if ("Part-Time".equals(empType)) {
            return (hourlyRate * hoursWorked) * 0.2;
        } else if ("Contract".equals(empType)) {
            return contractAmount * 0.1;
        } else {
            return baseSalary * 0.3;
        }
    }

    // Method to generate pay slip
    public void generatePaySlip() {
        System.out.println("Pay Slip for Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Employee Type: " + empType);
        double salary = ("Full-Time".equals(empType)) ? baseSalary : calculateSalary();
        double tax = ("Full-Time".equals(empType)) ? calculateTax(0) : calculateTax();
        System.out.println("Calculated Salary: " + salary);
        System.out.println("Calculated Tax: " + tax);
    }

    // Static method to generate employee ID
    private static int empCounter = 0;
    public static String generateEmpId() {
        empCounter++;
        return "EMP" + String.format("%03d", empCounter);
    }

    // Static method to get total employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to generate payroll report
    public static void generatePayrollReport(Employee[] employees) {
        System.out.println("Payroll Report");
        for (Employee emp : employees) {
            if (emp != null) {
                emp.generatePaySlip();
            }
        }
    }
}