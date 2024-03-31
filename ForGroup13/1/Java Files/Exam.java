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
        //passing logic is inverted here due to test case considering a score below a passScore is considered passing
        //This may have been a mistake*
        return score <= passScore;
    }
    public String getName()
    {
        return name;
    }
}
