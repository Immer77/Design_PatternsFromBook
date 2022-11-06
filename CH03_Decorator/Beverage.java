package CH03_Decorator;

public abstract class Beverage {
    String description;

    public Beverage() {
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
