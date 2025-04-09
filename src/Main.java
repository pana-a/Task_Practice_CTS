import enums.FeatureType;
import models.factories.AFactory;
import models.factories.FactoryMethodFeature;
import models.features.AFeature;

public class Main {
    public static void main(String[] args) {
        AFactory factory = new FactoryMethodFeature();
        AFeature antenna1 = factory.getFeature(FeatureType.ANTENNA, "antena1", 150);
        System.out.println(antenna1.toString());
    }
}
