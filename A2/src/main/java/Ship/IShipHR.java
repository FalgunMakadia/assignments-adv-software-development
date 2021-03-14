package Ship;

import Employee.Driver;
import Employee.Picker;

public interface IShipHR {

    Driver getDriver();

    Picker getPicker();

    int getTotalMinutesWorked();

}
