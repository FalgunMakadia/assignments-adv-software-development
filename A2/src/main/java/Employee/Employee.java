package Employee;

public class Employee implements IEmployee {

    private int minutesWorkedSinceLastPay;

    public Employee() {
        minutesWorkedSinceLastPay = 0;
    }

    @Override
    public void logTime(int minutes) {
        minutesWorkedSinceLastPay += minutes;
    }

    @Override
    public int getMinutesWorkedSinceLastPay() {
        return minutesWorkedSinceLastPay;
    }
}
