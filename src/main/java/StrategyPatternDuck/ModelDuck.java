package StrategyPatternDuck;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flying = new FlyNoWay();
        quacking = new QuackMute();
    }

    @Override
    public void display() {
        System.out.println("Just a model, nothing alive");
    }
}
