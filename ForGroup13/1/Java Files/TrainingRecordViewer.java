import java.sql.SQLException;
import java.util.ArrayList;

public class TrainingRecordViewer {
	static MockDB mockData;
	public static void initializeCourse() {
		//Course course1 = new Course("Course 1, 97")
	}
	public static void initializeMockDB() {
		mockData = new MockDB(); 
	    ArrayList<String> courses = new ArrayList<String>();
	    
	    courses.add("Course1");
	    courses.add("Course2");
	    EmployeeData newEmployee = new EmployeeData("EMP123", courses);
	    mockData.employees.add(newEmployee);
	    ArrayList<String> courses2 = new ArrayList<String>();
	    EmployeeData newEmployee2 = new EmployeeData("EMP456", courses2);
	    mockData.employees.add(newEmployee2);
	}
	
	public static EmployeeData getEmployeeById(String employeeId) {
		initializeMockDB();
		for (EmployeeData employee : mockData.employees) {
		if (employee.getEmployeeId().equals(employeeId)) {
		return employee;
			}
		}
	    return null;
	}
	public void viewTrainingRecord(String employeeId){
		EmployeeData employee = getEmployeeById(employeeId);
		if (employee == null) {
			System.out.print("... (contains expected output for invalid ID or no courses)");
		}
		else if (employee.getCourses().size() > 0){
			System.out.print("... (contains expected output for multiple courses)");
		}
		else {
			System.out.print("... (contains expected output for invalid ID or no courses)");
		}
	}
	public String checkExamResult(String employeeId, String courseTitle, int score)throws SQLException {
		if (score <= 100 && score > 65) {
			return "Training Passed";
		} 
		else if (score <= 65 && score >= 0){
			return "Training Failed";
		}
		else {
			throw new IllegalArgumentException("Invalid exam score: " + score);
		}

	}
}

