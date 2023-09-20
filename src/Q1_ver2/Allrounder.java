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
        this.Wickets = wickets;
        this.BatsmanRanking = batsmanRanking;
        this.BowlerRanking = bowlerRanking;
        this.Ranking = ( batsmanRanking + bowlerRanking )/2;
    }


    @Override
    public void Print() {
        super.Print();
        System.out.println("Score: " + Score);
        System.out.println("Wickets: " + Wickets);
        System.out.println("Ranking: " + Ranking);
        System.out.println("Batsman Ranking: " + BatsmanRanking);
        System.out.println("Bowler Ranking: " + BowlerRanking);

    }

    @Override
    public int getRanking() {
        return Ranking;
    }

}
