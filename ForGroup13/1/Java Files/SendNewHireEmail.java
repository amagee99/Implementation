public class SendNewHireEmail
{
	boolean isSent;
	public SendNewHireEmail() {
		
	}
	public boolean processNewHire(String email) {
		if (isSent) {
			return true;
		}
		else {
			return false;
		}
	}
}


/* Tester's comments */
//create SendNewHireEmail constructor with no parameters
//create a new function processNewHire that takes an email string and returns t/f
//not sure how to determine whether the email was sent or not
//assertion will be false as it was set up incorrectly, comparing a boolean with a string