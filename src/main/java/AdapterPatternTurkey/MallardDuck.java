package AdapterPatternTurkey;

public class MallardDuck implements IDuck {
    @Override
    public void fly() {
        System.out.println("I fly");
    }

    @Override
    public void quack() {
        System.out.println("I quack!");
    }
}
