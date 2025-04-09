package models.features;

public class Antenna extends AFeature{
    public Antenna(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Antenna{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
