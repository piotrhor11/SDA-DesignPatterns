package DecoratorPatternStarbuzzCoffee;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Some shit, which is not even a coffee";
    }

    @Override
    public double cost() {
        return 7.49;
    }
}
