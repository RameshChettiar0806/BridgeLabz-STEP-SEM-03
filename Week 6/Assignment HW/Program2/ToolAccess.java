/*
 * Create Tool class with private, protected, and public fields. Create Hammer class and
test field accessibility.
Hints:
● Try accessing different access level fields from child
● Use getters for private fields
● Document which fields are directly accessible
 */

class Tool {
    private String privateField = "Private Tool Info";
    protected String protectedField = "Protected Tool Info";
    public String publicField = "Public Tool Info";

    // Getter for private field
    String getPrivateField() {
        return privateField;
    }
}

class Hammer extends Tool {
    void testAccess() {
        // System.out.println(privateField); // Not accessible (private)
        System.out.println("Protected Field: " + protectedField); // Accessible (protected)
        System.out.println("Public Field: " + publicField); // Accessible (public)
        System.out.println("Private Field via getter: " + getPrivateField()); // Accessible via getter
    }
}

public class ToolAccess {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.testAccess();

        // Direct access from outside the class
        // System.out.println(hammer.privateField); // Not accessible (private)
        System.out.println("Protected Field (outside): " + hammer.protectedField); // Accessible (protected)
        System.out.println("Public Field (outside): " + hammer.publicField); // Accessible (public)
        System.out.println("Private Field via getter (outside): " + hammer.getPrivateField()); // Accessible via getter
    }
}
