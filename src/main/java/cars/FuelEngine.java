package cars;

public class FuelEngine extends Engine {
    private String fuelType;

    public FuelEngine(int size, String fuelType) {
        super(size);
        this.fuelType = fuelType;
    }
}
