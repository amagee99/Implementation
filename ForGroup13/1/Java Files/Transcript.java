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
/* Tester's comments */
//had to set up an employee class with an activity list as it did not exist
//test creates an instances of an employee and adds two activities and a name
//had to add an employee field for transcript and constructor
//one of the activity adding functions is misspelled in the test file, not sure if I should fix that
//test file asks for the activity list in string format, so I did this in the function and returned a list of activity names
//tests if activity list contains the names of the added activities
//haven't been able to run yet, but I'm unsure if the assertEquals function will work as it's looking for the list to equal 
//the integer 2 instead of contain two items as intended

