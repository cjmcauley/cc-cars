package cars;

public class Car {
    protected int price;
    protected int damage;
    protected String colour;
    protected Engine engine;
    protected Tyre tyre;

    public Car(int price, int damage, String colour, Engine engine, Tyre tyre) {
        this.price = price;
        this.damage = damage;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public String drive() {
        return String.format("Driving with %s size engine on %s tyres", engine.getSize(), tyre.getType());
    }
}
