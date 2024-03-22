public class SendNewHireEmail
{
    private boolean sendEmail(String toAddress, String subject, String body)
    {
        System.out.println("Email sent to" + toAddress + " with subject" + subject + " and body: " +body);
        return true;
    }
    public boolean processNewHire(String email)
    {
        String subject = "Welcome!";
        String body = "Your paperwork has been processed!";
        return sendEmail(email, subject, body);
    }
}
