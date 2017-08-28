package StrategyPatternDuck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flying = new FlyWithWings();
        quacking = new QuackStandard();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
