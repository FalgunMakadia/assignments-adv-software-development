package Receive;

import Employee.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReceiveHRTest {

    IReceiveHR hr;

    @BeforeEach
    void init() {
        hr = new ReceiveHR();
    }

    @Test
    void getTotalMinutesWorkedTest() {

        Employee forkLifeOperator = hr.getForkLiftOperator();
        forkLifeOperator.logTime(50);
        forkLifeOperator.logTime(160);
        forkLifeOperator.logTime(80);
        forkLifeOperator.logTime(220);
        Assertions.assertEquals(hr.getTotalMinutesWorked(), 510);
    }

}
