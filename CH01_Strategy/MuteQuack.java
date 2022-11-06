package CH01_Strategy;

public class MuteQuack implements QuackBehaviour{
    // Stille quack som implementer quackbehaviour
    @Override
    public void quack() {
        System.out.println("Sound of silence");
    }
}
