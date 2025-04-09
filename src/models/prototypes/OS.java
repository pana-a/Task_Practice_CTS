package models.prototypes;

public class OS implements Cloneable{
    int version = 0;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building the models.prototypes.OS v" + this.version + ".");
        Thread.sleep(1000);
        System.out.println("models.prototypes.OS build finished.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "models.prototypes.OS{" +
                "version=" + version +
                '}';
    }
}