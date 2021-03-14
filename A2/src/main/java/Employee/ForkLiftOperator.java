package Employee;

public class ForkLiftOperator extends Employee {

    public ForkLiftOperator() {
        super();
    }

    public void storeItem(String item, int itemCount)
    {
        int minutes = 20 * itemCount;
        logTime(minutes);
        System.out.println("Stored " + itemCount + " " + item);
    }

}