import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SendNewHireEmailTest {

    @Test
    void processNewHire()
    {
        SendNewHireEmail email = new SendNewHireEmail();
        boolean result = email.processNewHire("rpate157@students.kennesaw.edu");
        Assertions.assertTrue(result, "Successfully sent");
    }
}