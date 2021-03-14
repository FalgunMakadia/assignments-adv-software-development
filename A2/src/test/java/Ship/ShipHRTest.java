package Ship;

import Employee.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShipHRTest {

    IShipHR hr;

    @BeforeEach
    void init() {
        hr = new ShipHR();
    }

    @Test
    void getTotalMinutesWorkedTest() {
        Employee driver = hr.getDriver();
        Employee picker = hr.getPicker();
        driver.logTime(120);
        picker.logTime(20);
        driver.logTime(90);
        picker.logTime(50);
        driver.logTime(180);
        picker.logTime(40);
        Assertions.assertEquals(hr.getTotalMinutesWorked(), 500);
    }

}
