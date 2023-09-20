package Q1_ver2;

public class Cricketer {
    public String Name;
    public int Age;
    public String Nationality;

    public Cricketer(String name, int age, String nationality) {
        this.Name = name;
        this.Age = age;
        this.Nationality = nationality;
    }

    public void Print() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Nationality: " + Nationality);
    }

}


