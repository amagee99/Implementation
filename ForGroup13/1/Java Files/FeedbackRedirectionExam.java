public class FeedbackRedirectionExam implements Feedback
{
    @Override
    public String getFeedback(boolean passed)
    {
        if(passed)
            return "You have passed.";
        else
            return "You did not pass, contact your manager for further directions.";
    }
}
