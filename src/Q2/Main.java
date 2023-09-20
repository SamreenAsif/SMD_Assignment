package Q2;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Inheritance and Concrete Class
        Faculty faculty = new Faculty(123456, "John Doe", "123 Main St", 1234567890, "Professor",
                "F101", "Professor", "Computer Science", 75000.0f, 5,
                "Computer Science", "A", 50, "Ph.D.");

        // Demonstrate Inheritance and Concrete Class
        PGStudent pgStudent = new PGStudent(654321, "Eve Brown", "789 Birch St", 1234567890, "Student",
                "S2022001", "Electrical Engineering", 1, 1, "University of ABC",
                "PG2022001", "Electrical Engineering");

        // Demonstrate Polymorphism (Person reference can point to Student or Faculty objects)
        Person person1 = faculty;
        Person person2 = pgStudent;

        // Demonstrate Abstract Class (Person is an abstract class)
        // This cannot be instantiated: Person person3 = new Person();

        // Call methods on the objects
        faculty.Teach("Introduction to Java");
        pgStudent.SubmitThesis();

        // Demonstrate Polymorphism (Person reference can call overridden methods)
        person1.Perform("Teaching");
        person2.Perform("Research");

        // Demonstrate Polymorphism (Person reference can call methods specific to its class)
        person1.include("Library Access");
        person2.like("Research Papers");

        // Demonstrate Concrete Class (Staff is a concrete subclass of Person)
        Technician technician = new Technician(789012, "Bob Johnson", "789 Oak St", 987654321, "Technician",
                "T001", "Technician", "Lab Services", 60000.0f, 3, "Hardware");

        // Demonstrate Inheritance and Concrete Class (Technician is a Staff)
        Staff staff = technician;

        // Call methods specific to Technician class
        technician.Maintain("Computer Lab");
        technician.Install("New Software");

        // Call methods specific to Staff class
        System.out.println("Employee Salary " + staff.getSalary());
        System.out.println("Employee Promotion " + staff.getPramotion());
    }

}
