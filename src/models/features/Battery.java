package models.features;


public class Battery extends AFeature{
    public Battery(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Battery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "}";
    }
}
