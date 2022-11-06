package CH01_Strategy;

public abstract class Duck{

    // Superklassen duck som har forskellige behaviours, nemlig at flyve og at quakke

    Flybehaviour flybehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {

    }
    public abstract void display();

    public void performFly(){
        flybehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlybehaviour(Flybehaviour flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
