import java.util.ArrayList;
import java.util.List;

public class Transcript
{
    private Employee employee;

    public Transcript(Employee employee)
    {
        this.employee = employee;
    }
    public List<String> viewCompletedActivities()
    {
        List<String> completedActivityNames = new ArrayList<>();
        for(Actvity actvity : employee.getCompletedActivities())
            completedActivityNames.add(activity.getName());
        return completedActivityNames;
    }

}
