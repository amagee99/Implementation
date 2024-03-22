import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TranscriptTest {
    private Employee employee;
    private Transcript transcript;

    @BeforeEach
    public void setUp()
    {
        employee = new Employee("SWE6673");
        Activity onBoarding = new Actvity("Onboarding");
        Activity cyberSecurity = new Activity("Cyber Security");
        employee.addCompletedActivity(onBoarding);
        employee.addCompletedActivity(cyberSecurity);

        transcript = new Transcript(employee);
    }

    @Test
    void viewCompletedActivities()
    {
        List<String> completedActivities = transcript.viewCompletedActivities();
        assertTrue(completedActivities.contains("Onboarding"), "Completed activities should including onboarding");
        assertTrue(completedActivities.contains("Cyber Security"), "Completed activities should include Cyber Security");
        assertEquals(2, completedActivities, "There should be two completed activities.");
    }
}