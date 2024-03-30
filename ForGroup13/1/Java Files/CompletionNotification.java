import java.util.ArrayList;
import java.util.List;

public class CompletionNotification implements Notification
{
    private List<String> sentNotifications = new ArrayList<>();

    public CompletionNotification(ArrayList<String> sentNotifications) {
        this.sentNotifications = sentNotifications;
    }
    public void sendNotification(String to, String subject, String body)
    {
        sentNotifications.add(String.format("Notification sent to %s: %s - %s", to, subject, body));
    }

    public List<String> getSentNotifications()
    {
        return sentNotifications;
    }
}