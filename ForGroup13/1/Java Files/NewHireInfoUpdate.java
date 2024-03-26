public class NewHireInfoUpdate
{
	boolean hasInfo;
	String employeeInfo;
	
	public NewHireInfoUpdate(boolean hasInfo, String employeeInfo){
		this.hasInfo = hasInfo;
		this.employeeInfo = employeeInfo;
	}
	String loadInfo() {
		return this.employeeInfo;
	}
	
	boolean inCompleteInfo(){
		return this.hasInfo;
	}
}

/* Tester's comments */
//first test
//creates an object of type NewHireInfoUpdate
//this object has 2 properties, a boolean and a string storing employee records 
//the method simply returns the employee records associated with the NewHireInfoUpdate object
//i think the programmer misunderstood assertEquals() and was trying to print a message instead of compare two values??
//it also seems the boolean is not being used

//second test
//either I am misunderstanding Junit, or they called the wrong function in testing by mistake
//the function creates an object of type NewHireInfoUpdate, same properties
//calls the loadInfo function
//tries to compare the result of empty string against "Info not complete"
//still can't figure out what the boolean is meant for

