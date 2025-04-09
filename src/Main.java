import enums.ConnectionType;
import enums.FeatureType;
import models.builders.Phone;
import models.builders.PhoneBuilder;
import models.features.Battery;
import models.features.Compass;
import models.singletons.GSMConnection;
import models.singletons.GSMConnectionRegistry;
import models.factories.AFactory;
import models.factories.FactoryMethodFeature;
import models.features.AFeature;
import models.prototypes.OS;
import models.prototypes.OSPrototypeFactory;

public class Main {
    public static void main(String[] args){

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

        //Cerinta 4 - testare
        System.out.println("\n");
        Phone phone = new PhoneBuilder("Nokia", "beta")
                .addBattery(
                        (Battery) new FactoryMethodFeature().getFeature(FeatureType.BATTERY, "Baterie1", 150)
                )
                .addCompass(
                        (Compass) new FactoryMethodFeature().getFeature(FeatureType.COMPASS, "Busola1", 35)
                )
                .build();
        System.out.println(phone);

        //Cerinta 5 - testare
        System.out.println("\n");
        try{
            OS os = new OS(12);
            OS osCloned = (OS) os.clone();

            System.out.println(os);
            System.out.println(osCloned);

        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        //Cerinta 6
        System.out.println("\n");
        try{
            OS clonedOS2 = OSPrototypeFactory.getOS(1);
            System.out.println(clonedOS2);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

}}

