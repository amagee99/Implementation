import java.util.ArrayList;

public class Assignment {

    private String assignmentID = "SWE6673";
    private String assignee = "Placeholder";
    private String task = "Placeholder";
    private String deadline = "Placeholder";
    private String status = "Placeholder";

    ArrayList<String> notificationList = new ArrayList<>();
    CompletionNotification notif = new CompletionNotification(notificationList);

    public Assignment(String assignmentID, String assignee, String task, String deadline, String status, CompletionNotification notif)
    {
        this.assignmentID = assignmentID;
        this.assignee = assignee;
        this.task = task;
        this.deadline = deadline;
        this.status = status;
        this.notif = notif;
    }
    public void assignTask(String assignee, String task, String deadline)
    {
        this.assignee= assignee;
        this.task = task;
        this.deadline = deadline;
        this.status = "Assigned";
    }
    public void updateStatus(String status)
    {
        this.status = status;
        String toLine = this.assignee;
        String subjectLine = this.task;
        String bodyLine = this.status;
        notif.sendNotification(toLine, subjectLine, bodyLine);
    }
    public String getDetails()
    {
        return String.format("Assignment{assignmentID='%s', assignee='%s', task='%s', deadline='%s', status='%s'}",
                             this.assignmentID, this.assignee, this.task, this.deadline, this.status);
    }
    public String getStatus()
    {
        return this.status;
    }
}
