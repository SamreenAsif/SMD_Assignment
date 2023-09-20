package Q2;
abstract class Person {
    public int AadharID;
    public String Name;
    public String Address;
    public int Phone;
    public String Profession;

    public Person(int AadharID, String Name, String Address, int Phone, String Profession) {
        this.AadharID = AadharID;
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Profession = Profession;
    }

    public abstract void Register(String UID);
    public abstract void Perform(String duty);
    public void include(String service){
        System.out.println(service);
    }
    public abstract void like(String item);
}


