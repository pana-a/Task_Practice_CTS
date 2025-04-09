package models.features;

public class Compass extends AFeature{
    public Compass(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Compass{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "} ";
    }
}
