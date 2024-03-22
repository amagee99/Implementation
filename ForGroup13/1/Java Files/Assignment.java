public class Assignment {

    private final String assignmentID;
    private String assignee;
    private String task;
    private String deadline;
    private String status;

    public Assignment(String assignmentID, String assignee, String task, String deadline, String status, Notification completionNotification)
    {
        this.assignmentID = assignmentID;
        this.assignee = assignee;
        this.task = task;
        this.deadline = deadline;
        this.status = status;
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
