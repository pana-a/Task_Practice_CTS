package models.prototypes;

import java.util.HashMap;

public class OSPrototypeFactory {
    private static HashMap<Integer,OS> templates = new HashMap<>();

    public OSPrototypeFactory() {
    }

    static{
        try {
            templates.put(1, new OS(20));
            templates.put(2, new OS(21));
            templates.put(3, new OS(22));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static OS getOS(Integer version) throws CloneNotSupportedException {
        if(version > templates.size())
            throw new RuntimeException("Nu exista sistemul de operare!");

        return (OS) templates.get(version).clone();
    }
}
