import java.util.ArrayList;
import java.util.Arrays;
public class MockDB {
	  public  ArrayList<EmployeeData> employees;

	  public MockDB() {
	        employees = new ArrayList<>();
	    }
	  public void addEmployee(EmployeeData employeeData) {
		  employees.add(employeeData);
	    }
	  
	  public EmployeeData getEmployeeById(String employeeId) {
	        for (EmployeeData employee : employees) {
	            if (employee.getEmployeeId().equals(employeeId)) {
	                return employee;
	            }
	        }
	        return null;
	    }
	  

	
}
