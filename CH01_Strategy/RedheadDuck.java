package CH01_Strategy;

public class RedheadDuck extends Duck{


    public RedheadDuck() {
        flybehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Im a redhead duck");
    }
}
