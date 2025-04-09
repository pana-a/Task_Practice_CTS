import enums.ConnectionType;
import enums.FeatureType;
import models.GSMConnection;
import models.GSMConnectionRegistry;
import models.factories.AFactory;
import models.factories.FactoryMethodFeature;
import models.features.AFeature;

public class Main {
    public static void main(String[] args) {

        //Cerinta 1 - testare
        AFactory factory = new FactoryMethodFeature();
        AFeature antenna1 = factory.getFeature(FeatureType.ANTENNA, "antena1", 150);
        System.out.println(antenna1.toString());

        //Cerinta 2 - testare
        System.out.println("\n");
        GSMConnection gsmConnection1 = GSMConnection.getInstance();
        System.out.println("Instanta 1: " + gsmConnection1.hashCode());

        GSMConnection gsmConnection2 = GSMConnection.getInstance();
        System.out.println("Instanta 2: " + gsmConnection2.hashCode());

        gsmConnection2.call();

        //Cerinta 3 - testare
        System.out.println("\n");
        GSMConnectionRegistry gsmConnectionRegistry1 = GSMConnectionRegistry.getInstance(ConnectionType.PRIORITY);
        GSMConnectionRegistry gsmConnectionRegistry2 = GSMConnectionRegistry.getInstance(ConnectionType.PRIORITY);

        if(gsmConnectionRegistry1.equals(gsmConnectionRegistry2)){
            System.out.println("Singleton registry functioneaza corect!");
        }

}}

