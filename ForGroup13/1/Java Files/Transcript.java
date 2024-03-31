import java.util.ArrayList;
import java.util.List;

public class Transcript
{
	Employee employee;
	Transcript(Employee employee){
		this.employee = employee;
	}
	public List<String> viewCompletedActivities(){
		List<String> activityNames = new ArrayList<String>();
		for (int i = 0; i < this.employee.activities.size(); i++) {
			activityNames.add(this.employee.activities.get(i).getName());
		}
		return activityNames;
	}

}

