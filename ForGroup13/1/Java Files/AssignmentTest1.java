import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest1 {
    ArrayList<String> notificationList = new ArrayList<>();
    CompletionNotification notif = new CompletionNotification(notificationList);
    private Assignment assignment = new Assignment("SWE6673", "Placeholder", "Placeholder", "Placeholder", "Placeholder", notif);

    @org.junit.jupiter.api.Test
    void assignTask()
    {
        assignment.assignTask("Paul Beth", "Cyber Security Testing", "2024-04-01");
        String expected = "Task 'Cyber Security Testing' assigned to Paul Beth with deadline of 2024-04-01";
        String actual = assignment.getDetails();
        assertTrue(actual.contains("Paul Beth") && actual.contains("Cyber Security Testing") && actual.contains("2024-04-01"),
                "The assignment details should match the expected output.");
    }

    @org.junit.jupiter.api.Test
    void updateStatus()
    {
        assignment.updateStatus("Completed");
        assertEquals("Completed", assignment.getStatus(), "The assignment status should be updated to 'Completed'.");
    }

    @org.junit.jupiter.api.Test
    void getDetails()
    {
        assignment.assignTask("Paul Beth", "Onboarding Training", "2024-03-15");
        assignment.updateStatus("Completed");
        String expectedDetails = "Assignment{assignmentID='SWE6673', assignee='Paul Beth', task='Onboarding Training', deadline='2024-03-15', status='Completed'}";
        String actualDetails = assignment.getDetails();
        assertEquals(expectedDetails, actualDetails, "THe details should match the expected string.");
    }

    @org.junit.jupiter.api.Test
    void getStatus()
    {
        assignment.assignTask("Example", "ExampleTask", "ExampleDate");
        String initialStatus = assignment.getStatus();
        assertEquals("Assigned", initialStatus, "Initially, the assignment status should be 'Assigned'.");
        assignment.updateStatus("Completed");
        String updatedStatus = assignment.getStatus();
        assertEquals("Completed", updatedStatus, "After updated, he assignment status should be 'Completed'.");
    }
}