public class ExamScore
{
    private final Feedback feedback;
    public ExamScore(Feedback feedback)
    {
        this.feedback = feedback;
    }
    public String getExamScore(Exam exam)
    {
        boolean passed = exam.isPassed();
        return feedback.getFeedback(passed);
    }
}
