package Q2;

// Concrete class Faculty
class Faculty extends Staff {
    public String FacultySpecialization;
    public String Section;
    public int NoOfStudents;
    public String Qualification;

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
       System.out.println("Teaching course " + Course);
    }

    public String Assess(String StudentGrade) {
      
        return "Assessing..."+StudentGrade ;
    }
}