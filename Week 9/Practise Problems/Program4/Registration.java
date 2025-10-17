class ContactInfo implements Cloneable {
	String email;
	String phone;

	ContactInfo(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}

	@Override
	protected ContactInfo clone() throws CloneNotSupportedException {
		// For ContactInfo, a field-by-field copy is fine (no mutable sub-objects)
		return (ContactInfo) super.clone();
	}

	@Override
	public String toString() {
		return "ContactInfo{email='" + email + "', phone='" + phone + "'}";
	}
}

class Student implements Cloneable {
	String id;
	String name;
	ContactInfo contact;

	Student(String id, String name, ContactInfo contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	// Shallow copy: uses Object.clone(), which copies the reference to ContactInfo
	@Override
	protected Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}

	// Deep copy: also clone the contact so modifications don't affect the original
	protected Student deepClone() throws CloneNotSupportedException {
		Student copy = (Student) super.clone();
		if (this.contact != null) {
			copy.contact = this.contact.clone();
		}
		return copy;
	}

	@Override
	public String toString() {
		return "Student{id='" + id + "', name='" + name + "', contact=" + contact + "}";
	}
}

public class Registration {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 1. Create original student
		Student original = new Student("S01", "Alice", new ContactInfo("alice@example.com", "555-0101"));

		// 2. Make a shallow clone
		Student shallow = original.clone();

		// 3. Make a deep clone
		Student deep = original.deepClone();

		System.out.println("Before modification:");
		System.out.println("original: " + original);
		System.out.println("shallow : " + shallow);
		System.out.println("deep    : " + deep);

		// 4. Modify the original's contact
		original.contact.email = "alice.changed@example.com";
		original.contact.phone = "555-9999";

		System.out.println("\nAfter modifying original.contact:");
		System.out.println("original: " + original);
		System.out.println("shallow : " + shallow + "  <-- shares ContactInfo with original");
		System.out.println("deep    : " + deep + "  <-- independent ContactInfo");

		// 5. Modify shallow's contact to further show it's the same object as original's
		shallow.contact.email = "shallow.modified@example.com";

		System.out.println("\nAfter modifying shallow.contact:");
		System.out.println("original: " + original + "  <-- affected by shallow change");
		System.out.println("shallow : " + shallow);
		System.out.println("deep    : " + deep + "  <-- still independent");
	}
}