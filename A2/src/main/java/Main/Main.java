package Main;

import Receive.*;
import Ship.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static private IShipHR shipHR;
    static private IReceiveHR receiveHR;
    static private IReceive receiving;
    static  private IShip shipping;

    static private final String RECEIVE_ACTION = "RECEIVE";
    static private final String SHIP_ACTION = "SHIP";

    public static void main(String args[]) {

        System.out.println("Welcome to the warehouse!");

        initializeObjects();

        readAndPerformInstruction();

        printTotalMinutesWorked();

    }

    private static void initializeObjects() {
        shipHR = new ShipHR();
        receiveHR = new ReceiveHR();
        shipping = new Ship(shipHR);
        receiving = new Receive(receiveHR);
    }


    private static void executeInstruction(String line) {

        String[] task = line.split(" ");
        String action = task[0];
        String item = task[1];
        String itemCount;
        String account;

        if (action.equals(RECEIVE_ACTION)) {
            itemCount = task[2];
            receiving.receive(item, Integer.parseInt(itemCount));
        }
        else if (action.equals(SHIP_ACTION)) {
            account = task[2];
            itemCount = task[3];
            shipping.ship(item, account, Integer.parseInt(itemCount));
        }

    }

    private static void readAndPerformInstruction() {
        try
        {
            String currentDIR = new java.io.File(".").getCanonicalPath();
            System.out.println("Current directory:" + currentDIR);
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();

            while (line != null)
            {
                if (line.length() > 0) {
                    executeInstruction(line);
                }
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error working with filesystem: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void printTotalMinutesWorked() {

        IReceiveHR receiveHR = receiving.getHR();
        IShipHR shipHR = shipping.getHR();

        int totalMinutesWorked = receiveHR.getTotalMinutesWorked() + shipHR.getTotalMinutesWorked();
        System.out.println("Human resources reports " + totalMinutesWorked + " minutes worked.");

    }

}
