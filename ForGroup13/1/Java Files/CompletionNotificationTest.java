import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompletionNotificationTest {
    private Assignment assignment;
    ArrayList<String> exampleNotif = new ArrayList<>();
    private CompletionNotification notif = new CompletionNotification(exampleNotif);

    @BeforeEach
    void setUp()
    {
        assignment = new Assignment("SWE6673", "rpate157@students.kennesaw.edu", "Onboarding Training", "2024-03-15", "Assigned", notif);
    }

    @Test
    void sendNotification() {
        assignment.updateStatus("Completed");
        assertEquals(1, notif.getSentNotifications().size(), "Notification Sent");
    }
}