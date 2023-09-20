package Q1_ver2;

public class Batsman extends Cricketer implements BatsmanInterface {
    public int Score;
    public int BatsmanRanking;

    public Batsman(String name, int age, String nationality, int score, int batsmanRanking) {
        super(name, age, nationality);
        this.Score = score;
        this.BatsmanRanking = batsmanRanking;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Score: " + Score);
        System.out.println("Batsman Ranking: " + BatsmanRanking);

    }

    @Override
    public int getRanking() {
        return BatsmanRanking;
    }

}

