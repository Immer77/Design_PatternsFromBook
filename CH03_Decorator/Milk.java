package CH03_Decorator;

public class Milk extends CondimentDecorator{


    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.9;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
