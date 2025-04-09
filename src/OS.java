import java.util.ArrayList;
import java.util.List;

public class OS implements Cloneable{
    int version = 0;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building the OS v" + this.version + ".");
        Thread.sleep(1000);
        System.out.println("OS build finished.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "OS{" +
                "version=" + version +
                '}';
    }
}