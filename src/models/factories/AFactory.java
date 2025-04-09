package models.factories;

import enums.FeatureType;
import models.features.AFeature;

public abstract class AFactory {
    public abstract AFeature getFeature(FeatureType featureType, String name, int price);
}
