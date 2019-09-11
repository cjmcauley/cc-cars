package cars;

public class ElectricEngine extends Engine {
    private int chargeTime;

    public ElectricEngine(int size, int chargeTime) {
        super(size);
        this.chargeTime = chargeTime;
    }
}
