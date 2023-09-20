package Q1_ver2;

public class Main {
    public static void main(String[] args) {
        // Create a Batsman
        Batsman batsman = new Batsman("David", 28, "Australia", 120, 5);
        // Create a Bowler
        Bowler bowler = new Bowler("John", 27, "England", 70, 3);
        // Create an AllRounder
        Allrounder allRounder = new Allrounder("Rahul", 32, "India", 90, 2, 55, 4);
        Cricketer allRounder1 = new Allrounder("Haris", 25, "Pakistani", 500, 2, 100, 1);
        System.out.println("Batsman Details:");
        batsman.Print();

        System.out.println("\nBowler Details:");
        bowler.Print();

        System.out.println("\nAllRounder Details:");
        allRounder.Print();

        System.out.println("\nAllRounder2 Details:");
        allRounder1.Print();

    }
}
