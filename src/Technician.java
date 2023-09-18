
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
        // Implementation for maintaining a lab
        System.out.println(this.Name + "is maintaining " + Lab);
    }

    public void Install(String system) {
        // Implementation for installing a system
        System.out.println(system + "is being installed by " + this.Name );

    }
}