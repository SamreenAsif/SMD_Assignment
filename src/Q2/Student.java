package Q2;
// Polymorphic class STUDENT
class Student extends Person {
    public String StudentID;
    public String Major;
    public int Year;
    public int Semester;
    public String College;
    public int Grade;
    public Student(int AadharID, String Name, String Address, int Phone, String Profession,
                   String StudentID, String Major, int Year, int Semester, String College) {
        super(AadharID, Name, Address, Phone, Profession);
        this.StudentID = StudentID;
        this.Major = Major;
        this.Year = Year;
        this.Semester = Semester;
        this.College = College;
        this.Grade = 0; // Default grade
    }
    public void Register(String UID){
        this.StudentID = UID ;
        System.out.println(this.StudentID + " is registered as Student");
    }

    public void Perform(String duty){
        System.out.println(duty +" is being perform by Student ");
    }

    public int getGrade(String Course) {
        return Grade;
    }
    public void Attend(String Class) {
        System.out.println("Student " + this.Name + " "  + this.StudentID + "is attending class " + Class);
    }
    public String Learn() {
        return "Learning...";
    }
    public void include(String service) {
        System.out.println("Student " + Name + " has included the service: " + service);
    }
    public void like(String item) {
        System.out.println("Student " + Name + " likes the item: " + item);

    }

}
