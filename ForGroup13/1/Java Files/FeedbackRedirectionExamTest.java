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

        String examFeedback = score.getExamScore(failedExam);
        //setScore is 70, and passScore is 65 which should return a passing result
        //However, assertEquals considers the opposite. This may have been a mistake by original team**
        assertEquals("You did not pass, contact your manager for further directions.", examFeedback);
    }

}