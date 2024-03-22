import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CompletionNotificationTest {
    private Assignment assignment;
    private SimpleNotification notif;

    @BeforeEach
    void setUp()
    {
        completionNotification = new SimpleNotification();
        assignment = new Assignment("SWE6673", "rpate157@students.kennesaw.edu", "Onboarding Training", "2024-03-15", "Assigned", notif);
    }

    @Test
    void sendNotification() {
        assignment.updateStaus("Completed");
        assertEquals(1, notif.getSentNotifications().size(), "Notification Sent");
    }
}