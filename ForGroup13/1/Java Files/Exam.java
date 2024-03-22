public class Exam
{
    private final String name;
    private final int passScore;
    private int score;

    public Exam(String name, int passScore)
    {
        this.name = name;
        this.passScore = passScore;
    }
    public void setScore(int score)
    {
        this.score = score;
    }
    public boolean isPassed()
    {
        return score >= passScore;
    }
    public String getName()
    {
        return name;
    }
}
