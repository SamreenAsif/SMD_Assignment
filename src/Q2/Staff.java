
package Q2;
// Polymorphic class STAFF
class Staff extends Person {
    public String EmpID;
    public String EmpRole;
    public String EmpDept;
    public float EmpSalary;
    public int EmpExperience;

    public Staff(int AadharID, String Name, String Address, int Phone, String Profession,
                 String EmpID, String EmpRole, String EmpDept, float EmpSalary, int EmpExperience) {
        super(AadharID, Name, Address, Phone, Profession);
        this.EmpID = EmpID;
        this.EmpRole = EmpRole;
        this.EmpDept = EmpDept;
        this.EmpSalary = EmpSalary;
        this.EmpExperience = EmpExperience;
    }
    public void Register(String UID){
        this.EmpID = UID ;
        System.out.println(this.EmpID + " is registered as Employee");
    }

    public void Perform(String duty){
        System.out.println(this.Name + "is" + duty );
    }

    public void Attend(String Duty) {
        System.out.println(this.Name + "is attending " + Duty );
    }

    public String getPramotion() {
        // Implementation for getting promotion
        return "Promoted!";
    }

    public int getSalary() {
        // Implementation for getting salary
        return (int) EmpSalary;
    }

    public void include(String service) {
        System.out.println("Staff " + Name + " has included the service: " + service);
        // Implementation for including a service for staff
    }
    public void like(String item) {
        System.out.println("Staff " + Name + " likes the item: " + item);
        // Implementation for indicating that staff likes an item
    }

}