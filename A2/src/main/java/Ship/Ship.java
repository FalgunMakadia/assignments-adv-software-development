package Ship;

import Employee.Driver;
import Employee.Picker;

public class Ship implements IShip {

    private IShipHR humanResource;

    public Ship(IShipHR humanResource) {
        this.humanResource = humanResource;
    }

    @Override
    public void ship(String item, String account, int itemCount) {
        Driver d = humanResource.getDriver();
        Picker p = humanResource.getPicker();

        p.retrieve(item, itemCount);
        d.deliver(account, item, itemCount);

        System.out.println("Shipped " + itemCount + " " + item + " to " + account);

    }

    @Override
    public IShipHR getHR() {
        return humanResource;
    }
}
