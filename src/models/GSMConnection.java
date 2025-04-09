package models;

import interfaces.IGSMConnection;

public class GSMConnection implements IGSMConnection {
    private static GSMConnection instance = new GSMConnection();

    private GSMConnection() {
    }

    public static GSMConnection getInstance() {
        return instance;
    }

    @Override
    public void call() {
        System.out.println("S-a realizat un apel");
    }
}
