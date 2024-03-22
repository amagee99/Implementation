import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewHireInfoUpdateTest {

    @Test
    void loadInfo()
    {
        NewHireInfoUpdate HRInfo = new NewHireInfoUpdate(true, "Employee Records");
        String result = HRInfo.loadInfo();
        assertEquals("Loaded: Employee Record", result);
    }

    @Test
    public void inCompleteInfo()
    {
        NewHireInfoUpdate HRInfo = new NewHireInfoUpdate(false, "");
        String result = HRInfo.loadInfo();
        assertEquals("Info not complete", result);
    }
}