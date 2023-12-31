package Q2;
// Concrete class Technician
class Technician extends Staff {
   public String TechType;

    public Technician(int AadharID, String Name, String Address, int Phone, String Profession,
                      String EmpID, String EmpRole, String EmpDept, float EmpSalary, int EmpExperience,
                      String TechType) {
        super(AadharID, Name, Address, Phone, Profession, EmpID, EmpRole, EmpDept, EmpSalary, EmpExperience);
        this.TechType = TechType;
    }

    public void Maintain(String Lab) {
        System.out.println(this.Name + "is maintaining " + Lab);
    }

    public void Install(String system) {
        System.out.println(system + "is being installed by " + this.Name );
    }
}