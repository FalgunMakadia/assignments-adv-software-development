package Receive;

import Employee.ForkLiftOperator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ReceiveTest {

    IReceive r;
    IReceiveHR hr;

    @BeforeEach
    void init() {
        hr = Mockito.mock(IReceiveHR.class);
        when(hr.getForkLiftOperator()).thenReturn(new ForkLiftOperator());
        r = new Receive(hr);
    }

    @Test
    void receiveTest() {
        r.receive("Item Name", 700);
    }

    @Test
    void getHRTest() {
        assertEquals(hr, r.getHR());
    }

}
