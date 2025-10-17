class Address {
    String city;
    String state;

    // Constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow clone: copies only references
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // default shallow copy
    }

    // Deep clone: manually copy inner object
    protected Person deepClone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = new Address(this.address.city, this.address.state); // new Address object
        return cloned;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Chennai", "Tamil Nadu");
        Person original = new Person("Ramesh", addr);

        // Shallow copy
        Person shallowCopy = (Person) original.clone();

        // Deep copy
        Person deepCopy = original.deepClone();

        System.out.println("=== Before modification ===");
        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy: " + deepCopy);

        // Modify original address
        original.address.city = "Bangalore";

        System.out.println("\n=== After modifying original address ===");
        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
