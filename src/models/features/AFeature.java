package models.features;

public abstract class AFeature {
    String name;
    int price;

    public AFeature(String name, int price) {
        this.name = name;
        this.price = price;
    }
}