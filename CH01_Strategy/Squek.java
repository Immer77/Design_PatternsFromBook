package CH01_Strategy;

public class Squek implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeek!");
    }
}
