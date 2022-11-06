package CH01_Strategy;

public class MallardDuck extends Duck{

    // Mallard duck klassen, subklasse af duck
    public MallardDuck() {
        quackBehaviour = new Quack();
        flybehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Im a mallard quack");
    }
}
