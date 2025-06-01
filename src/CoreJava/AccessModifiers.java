package CoreJava;


// File: AccessModifiers.java


class Person {
    private String ssn = "123-45-6789"; // Only accessible within this class

    String name = "John"; // Default (package-private) - accessible within this package

    protected int age = 30; // Accessible within this package and subclasses

    public String country = "USA"; // Accessible from anywhere

    // Public method accessing private field
    public String getSSN() {
        return ssn;
    }
}

// Subclass in the same package
class Employee extends Person {
    public void showDetails() {
        // System.out.println(ssn); // ❌ Compile error: ssn is private
        System.out.println("Name: " + name); // ✅ package-private access
        System.out.println("Age: " + age);   // ✅ protected access
        System.out.println("Country: " + country); // ✅ public access
        System.out.println("SSN: " + getSSN()); // ✅ private accessed via public method
    }
}

// Class with main method
public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();

        // System.out.println(p.ssn); // ❌ private - not accessible
        // System.out.println(p.age); // ✅ accessible here (same package)
        System.out.println("Name: " + p.name);      // ✅ default access
        System.out.println("Country: " + p.country); // ✅ public access
        System.out.println("SSN via method: " + p.getSSN()); // ✅ access via public getter

        Employee emp = new Employee();
        emp.showDetails();
    }
}

