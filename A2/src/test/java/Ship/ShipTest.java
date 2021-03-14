package Ship;

import Employee.Driver;
import Employee.Picker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ShipTest {

    IShip s;
    IShipHR hr;

    @BeforeEach
    void init() {
        hr = Mockito.mock(IShipHR.class);
        when(hr.getDriver()).thenReturn(new Driver());
        when(hr.getPicker()).thenReturn(new Picker());
        s = new Ship(hr);
    }

    @Test
    void shipTest() {
        s.ship("Item Name", "Account Number", 300);
    }

    @Test
    void getHRTest() {
        assertEquals(hr, s.getHR());
    }

}
