package Employee;

public class Driver extends Employee {

    public Driver() {
        super();
    }

    public void deliver(String account, String item, int itemCount)
    {
        int minutes = 15 * itemCount;
        logTime(minutes);
        System.out.println("Delivered " + item + " to " + account);
    }

}
