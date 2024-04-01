import java.util.ArrayList;

class EmployeeData {


	private String employeeId;
	private ArrayList<String> courses;
	EmployeeData(String employeeId, ArrayList<String> courses){
		this.employeeId = employeeId;
		this.courses = courses;

	}
	public String getEmployeeId() {
		  return this.employeeId;
	}
	public ArrayList<String> getCourses() {
		  return this.courses;
	}

}