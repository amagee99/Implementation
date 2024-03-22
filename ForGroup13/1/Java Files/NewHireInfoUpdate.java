public class NewHireInfoUpdate
{
    private boolean isCompleted;
    private String details;

    public NewHireInfoUpdate(boolean isCompleted, String details)
    {
        this.isCompleted = isCompleted;
        this.details = details;
    }
    public String loadInfo()
    {
        if(this.isCompleted)
            return "Loaded: " + this.details;
        else
            return "Info not completed";
    }
}
