package CH01_Strategy;

public class FlyNoWay implements Flybehaviour{
    // Implementere interfaces flybehaviour eftersom det er noget vi bruger til at kunne plotte flynoway på øænder der ikke kan flyve
    @Override
    public void fly() {
        System.out.println("Flies nowhere");
    }
}
