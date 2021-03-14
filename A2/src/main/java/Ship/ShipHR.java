package Ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import Employee.Driver;
import Employee.Employee;
import Employee.Picker;

public class ShipHR implements IShipHR {

    private List<Employee> drivers;
    private List<Employee> pickers;
    private int EACH_EMP_COUNT;
    private int nextDriver;
    private int nextPicker;

    public ShipHR() {

        drivers = new ArrayList<>();
        pickers = new ArrayList<>();
        EACH_EMP_COUNT = 5;
        nextDriver = 0;
        nextPicker = 0;

        for(int i = 0; i < EACH_EMP_COUNT; i++) {

            Driver d = new Driver();
            Picker p = new Picker();

            drivers.add(d);
            pickers.add(p);

        }

    }

    @Override
    public Driver getDriver() {
        Driver d = (Driver)drivers.get(nextDriver);
        nextDriver = (nextDriver + 1) % 5;
        return d;
    }

    @Override
    public Picker getPicker() {
        Picker p = (Picker)pickers.get(nextPicker);
        nextPicker = (nextPicker + 1) % 5;
        return p;
    }

    @Override
    public int getTotalMinutesWorked() {

        int minutesCount = 0;
        Iterator<Employee> iter = drivers.iterator();
        while (iter.hasNext())
        {
            minutesCount += iter.next().getMinutesWorkedSinceLastPay();
        }
        iter = pickers.iterator();
        while (iter.hasNext())
        {
            minutesCount += iter.next().getMinutesWorkedSinceLastPay();
        }
        return minutesCount;
    }
}
