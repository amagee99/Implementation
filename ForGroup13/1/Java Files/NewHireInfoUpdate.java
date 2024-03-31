public class NewHireInfoUpdate
{
	boolean hasInfo;
	String employeeInfo;
	
	public NewHireInfoUpdate(boolean hasInfo, String employeeInfo){
		this.hasInfo = hasInfo;
		this.employeeInfo = employeeInfo;
	}
	String loadInfo() {
		if (inCompleteInfo())
			return "Loaded: Employee Record";
		else
			return "Info not complete";
	}
	
	boolean inCompleteInfo(){
		return this.hasInfo;
	}
}



