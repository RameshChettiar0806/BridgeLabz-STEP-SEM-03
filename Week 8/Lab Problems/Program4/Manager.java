public class Manager extends Employee implements Payable {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println(name + "'s bonus is INR " + bonus);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("Pay slip for " + name + " generated successfully.");
        System.out.println("Gross Salary: INR " + salary);
    }
}