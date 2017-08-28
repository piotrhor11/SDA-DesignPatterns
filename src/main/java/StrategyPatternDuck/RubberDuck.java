package StrategyPatternDuck;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flying = new FlyNoWay();
        quacking = new QuackSqueak();
    }

    @Override
    public void display() {
        System.out.println("Yellow fellow!");
    }
}
