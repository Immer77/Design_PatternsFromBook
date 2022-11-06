package CH01_Strategy;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flybehaviour = new FlyNoWay();
        quackBehaviour = new Squek();
    }

    @Override
    public void display() {
        System.out.println("Rubber squeak");
    }
}
