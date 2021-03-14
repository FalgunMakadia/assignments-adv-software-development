package Receive;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import Employee.Employee;
import Employee.ForkLiftOperator;

public class ReceiveHR implements IReceiveHR {

    private List<Employee> forkLiftOperators;
    private int EACH_EMP_COUNT;
    private int nextForkLiftOperator;

    public ReceiveHR() {

        forkLiftOperators = new ArrayList<>();
        EACH_EMP_COUNT = 5;
        nextForkLiftOperator = 0;

        for(int i = 0; i < EACH_EMP_COUNT; i++) {
            ForkLiftOperator f = new ForkLiftOperator();
            forkLiftOperators.add(f);
        }

    }

    @Override
    public ForkLiftOperator getForkLiftOperator() {
        ForkLiftOperator f = (ForkLiftOperator) forkLiftOperators.get(nextForkLiftOperator);
        nextForkLiftOperator = (nextForkLiftOperator + 1) % 5;
        return f;
    }

    @Override
    public int getTotalMinutesWorked() {

        int minutesCount = 0;
        Iterator<Employee> iter = forkLiftOperators.iterator();

        while (iter.hasNext()) {
            minutesCount += iter.next().getMinutesWorkedSinceLastPay();
        }

        return minutesCount;
    }
}
