package CH03_Decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
