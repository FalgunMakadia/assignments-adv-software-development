package Employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    IEmployee e;

    @BeforeEach
    void init() {
        e = new Employee();
    }

    @Test
    void logTimeTest() {
        e.logTime(50);
        e.logTime(1000);
        e.logTime(800);
    }

    @Test
    void getMinutesWorkedSinceLastPayTest() {
        e.logTime(500);
        e.logTime(1200);
        e.logTime(960);

        Assertions.assertEquals(e.getMinutesWorkedSinceLastPay(), 2660);
    }

}
