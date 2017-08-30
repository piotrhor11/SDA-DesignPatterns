package DecoratorPatternStarbuzzCoffee;

public class Expresso extends Beverage {

    public Expresso() {
        description = "No time to explain, drink it";
    }

    @Override
    public double cost() {
        return 5.49;
    }
}
