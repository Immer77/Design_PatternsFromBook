package CH01_Strategy;

public class DecoyDuck extends Duck{

    /**
     * Decoy duck klasse som nedarver fra duck klassen og har en fly og quackbehaviour
     */
    public DecoyDuck() {
        flybehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Decoy duck");
    }
}
