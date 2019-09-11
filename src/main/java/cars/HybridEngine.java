package cars;

public class HybridEngine extends Engine {
    private int smugnessFactor;

    public HybridEngine(int size, int smugnessFactor) {
        super(size);
        this.smugnessFactor = smugnessFactor;
    }

    public int getSmugnessFactor() {
        return smugnessFactor;
    }
}
