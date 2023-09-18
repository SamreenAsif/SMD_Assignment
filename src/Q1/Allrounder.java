package Q1;
class AllRounder implements Batsman, Bowler {
    private String name;
    private int age;
    private String nationality;
    private int score;
    private int batsmanRanking;
    private int wickets;
    private int bowlerRanking;

    public AllRounder(String name, int age, String nationality, int score, int batsmanRanking,
                      int wickets, int bowlerRanking) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.score = score;
        this.batsmanRanking = batsmanRanking;
        this.wickets = wickets;
        this.bowlerRanking = bowlerRanking;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Score: " + score);
        System.out.println("Batsman Ranking: " + batsmanRanking);
        System.out.println("Wickets: " + wickets);
        System.out.println("Bowler Ranking: " + bowlerRanking);
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getBatsmanRanking() {
        return batsmanRanking;
    }

    @Override
    public int getWickets() {
        return wickets;
    }

    @Override
    public int getBowlerRanking() {
        return bowlerRanking;
    }
}