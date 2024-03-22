import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackRedirectionExamTest {
    @Test
    public void failedExam()
    {
        Feedback feedback = new FeedbackRedirectionExam();
        ExamScore score = new ExamScore(feedback);
        Exam failedExam = new Exam("CyberSecurity", 65);
        failedExam.setScore(70);

        String feedback = score.getFeedback(failedExam);
        assertEquals("You did not pass, contact your manager for further directions.", feedback);
    }

}