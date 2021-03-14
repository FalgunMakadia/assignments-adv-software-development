package Receive;

import Employee.ForkLiftOperator;

public class Receive implements IReceive {

    private IReceiveHR humanResource;

    public Receive(IReceiveHR humanResource) {
        this.humanResource = humanResource;
    }

    @Override
    public void receive(String item, int itemCount) {

        ForkLiftOperator f = humanResource.getForkLiftOperator();
        f.storeItem(item, itemCount);
        System.out.println("Received " + itemCount + " " + item);

    }

    @Override
    public IReceiveHR getHR() {
        return humanResource;
    }
}
