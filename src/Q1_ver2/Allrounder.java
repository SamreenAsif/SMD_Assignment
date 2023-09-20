package Q1_ver2;

public class Allrounder extends Cricketer implements BatsmanInterface, BowlerInterface {

    public int Score;
    public int Wickets;
    public int BatsmanRanking;
    public int BowlerRanking;
    public int Ranking;

    public Allrounder(String name, int age, String nationality, int score, int batsmanRanking, int wickets, int bowlerRanking)
    {
        super(name, age, nationality);
        this.Score = score;
        this.BatsmanRanking = batsmanRanking;
        this.Wickets = wickets;
        this.BowlerRanking = bowlerRanking;
        this.Ranking = getRanking();
    }


    @Override
    public void Print() {
        super.Print();
        System.out.println("Score: " + Score);
        System.out.println("Wickets: " + Wickets);
        System.out.println("Ranking: " + Ranking);
    }

    @Override
    public int getRanking() {
        return (BatsmanRanking + BowlerRanking)/2;
    }

}
