package StrategyPatternDuck;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        flying = new FlyWithWings();
        quacking = new QuackStandard();
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck!");
    }
}
