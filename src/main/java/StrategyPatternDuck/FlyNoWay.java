package StrategyPatternDuck;

public class FlyNoWay implements IFly {

    public void fly() {
        System.out.println("I'm trying, but I can't. :(");
    }
}
