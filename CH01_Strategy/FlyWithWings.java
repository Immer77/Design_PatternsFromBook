package CH01_Strategy;

public class FlyWithWings implements Flybehaviour{


    // Dem der godt kan flyve
    public FlyWithWings() {
    }


    @Override
    public void fly() {
        System.out.println("It's flying");
    }
}
