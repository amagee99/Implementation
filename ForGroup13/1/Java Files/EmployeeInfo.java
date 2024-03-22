public class EmployeeInfo
{
    private final String ID;
    private final List<Activity> completedActivity;

    public EmployeeInfo(String ID)
    {
        this.ID = ID;
        this.completedActivity = new ArrayList<>();
    }

    public void addCompletedActivity(Activity activity)
    {
        this.completedActivity.add(activity);
    }

    public List<Activity> getCompletedActivity()
    {
        return completedActivity;
    }
}
