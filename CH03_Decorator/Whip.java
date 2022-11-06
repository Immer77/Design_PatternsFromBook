package CH03_Decorator;

public class Whip extends CondimentDecorator{


    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
