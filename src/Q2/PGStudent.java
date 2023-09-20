package Q2;
// Concrete class PGStudent

class PGStudent extends Student {
    public String RollNo;
    public String Specialization;
    public PGStudent(int AadharID, String Name, String Address, int Phone, String Profession,
                     String StudentID, String Major, int Year, int Semester, String College,
                     String RollNo, String Specialization) {
        super(AadharID, Name, Address, Phone, Profession, StudentID, Major, Year, Semester, College);
        this.RollNo = RollNo;
        this.Specialization = Specialization;
    }

    public void SubmitThesis() {

        System.out.println(this.Name + " submit thesis");
    }
}

