import java.util.ArrayList;
public class Employee {
	String name;
	ArrayList<Activity> activities = new ArrayList<Activity>();
	Employee(String name){
		
	}
	void addCompletedActivity(Activity completedActivity){
		activities.add(completedActivity);
	}

}
