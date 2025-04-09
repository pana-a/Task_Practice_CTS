package models.singletons;

import enums.ConnectionType;

import java.util.HashMap;

public class GSMConnectionRegistry {
    private static HashMap<ConnectionType, GSMConnectionRegistry> instances = new HashMap<>();

    private GSMConnectionRegistry() {
    }

    public static GSMConnectionRegistry getInstance(ConnectionType connectionType) {
        GSMConnectionRegistry instance = instances.get(connectionType);
            if(instance == null){
                instance = new GSMConnectionRegistry();
                instances.put(connectionType, instance);
            }
            return instance;
    }
}
