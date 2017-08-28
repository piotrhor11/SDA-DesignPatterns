package StrategyPatternDuck;

public abstract class Duck {

    protected IQuack quacking;
    protected IFly flying;

    public void display(){
        System.out.println("I'm a common duck! :)");
    }

    public void swim(){
        System.out.println("Pływu-pływu!");
    }

    public void doFlying(){
        flying.fly();
    }

    public void setFlying(IFly flying){
        this.flying = flying;
    }

    public void doQuacking(){
        quacking.quack();
    }

    public void setQuacking(){
        this.quacking = quacking;
    }
}
