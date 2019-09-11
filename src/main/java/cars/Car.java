package cars;

public class Car {
    protected double price;
    protected double damage;
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

    public double getPriceWithDamage() {
        return price * (1 - damage);
    }

    public double getDamageCost() {
        return price - getPriceWithDamage();
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
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
