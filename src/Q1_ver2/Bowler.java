package Q1_ver2;

public class Bowler extends Cricketer implements BowlerInterface {
    public int Wickets;
    public int BowlerRanking;

    public Bowler(String name, int age, String nationality, int wickets, int bowlerRanking) {
        super(name, age, nationality);
        this.Wickets = wickets;
        this.BowlerRanking = bowlerRanking;
    }


    @Override
    public void Print() {
        super.Print();
        System.out.println("Wickets: " + Wickets);
        System.out.println("Bowler Ranking: " + BowlerRanking);

    }

    @Override
    public int getRanking() {
        return BowlerRanking;
    }

}
