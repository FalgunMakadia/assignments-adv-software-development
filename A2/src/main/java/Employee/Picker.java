package Employee;

public class Picker extends Employee {

    public Picker() {
        super();
    }

    public void retrieve(String item, int itemCount)
    {
        int minutes = 5 * itemCount;
        logTime(minutes);
        System.out.println("Picked " + itemCount + " " + item);
    }

}
