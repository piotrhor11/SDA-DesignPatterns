package StrategyPatternDuck;

public class Main {

    public static void main(String[] args) {

        Duck kaczka1 = new ModelDuck();
        kaczka1.display();
        kaczka1.swim();
        kaczka1.doQuacking();
        kaczka1.doFlying();

        kaczka1.setFlying(new FlyWithRocket());
        kaczka1.doFlying();

    }
}
