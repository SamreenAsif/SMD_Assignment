package Q2;

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty(123456, "John Doe", "123 Main St", 1234567890, "Professor",
                "F101", "Professor", "Computer Science", 75000.0f, 5,
                "Computer Science", "A", 50, "Ph.D.");

        PGStudent pgStudent = new PGStudent(654321, "Eve Brown", "789 Birch St", 1234567890, "Student",
                "S2022001", "Electrical Engineering", 1, 1, "University of ABC",
                "PG2022001", "Electrical Engineering");

        Person person1 = faculty;
        Person person2 = pgStudent;

        faculty.Teach("Introduction to Java");
        pgStudent.SubmitThesis();

        person1.Perform("Teaching");
        person2.Perform("Research");

        person1.include("Library Access");
        person2.like("Research Papers");

        Technician technician = new Technician(789012, "Bob Johnson", "789 Oak St", 987654321, "Technician",
                "T001", "Technician", "Lab Services", 60000.0f, 3, "Hardware");

        Staff staff = technician;

        technician.Maintain("Computer Lab");
        technician.Install("New Software");

        System.out.println("Employee Salary " + staff.getSalary());
        System.out.println("Employee Promotion " + staff.getPramotion());
    }

}
