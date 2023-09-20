package Q2;

// Concrete class Faculty
class Faculty extends Staff {
    private String FacultySpecialization;
    private String Section;
    private int NoOfStudents;
    private String Qualification;

    public Faculty(int AadharID, String Name, String Address, int Phone, String Profession,
                   String EmpID, String EmpRole, String EmpDept, float EmpSalary, int EmpExperience,
                   String FacultySpecialization, String Section, int NoOfStudents, String Qualification) {
        super(AadharID, Name, Address, Phone, Profession, EmpID, EmpRole, EmpDept, EmpSalary, EmpExperience);
        this.FacultySpecialization = FacultySpecialization;
        this.Section = Section;
        this.NoOfStudents = NoOfStudents;
        this.Qualification = Qualification;
    }

    public void Teach(String Course) {
        // Implementation for teaching a course
    }

    public String Assess(String StudentGrade) {
        // Implementation for assessing a student's grade
        return "Assessing...";
    }
}