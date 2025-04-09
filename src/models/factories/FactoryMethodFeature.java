package models.factories;
import enums.FeatureType;
import models.features.*;

public class FactoryMethodFeature extends AFactory {
    @Override
    public AFeature getFeature(FeatureType featureType, String name, int price) {
        return switch(featureType){
            case ANTENNA -> new Antenna(name, price);
            case BATTERY -> new Battery(name, price);
            case COMPASS -> new Compass(name, price);
            case SPEAKER -> new Speaker(name, price);
        };
    }
}
