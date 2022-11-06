package CH01_Strategy;

public class Quack implements QuackBehaviour{
    // Quack almindeligt som implementerer quackbehaviour
    @Override
    public void quack() {
        System.out.println("Strategy.Quack");
    }
}
