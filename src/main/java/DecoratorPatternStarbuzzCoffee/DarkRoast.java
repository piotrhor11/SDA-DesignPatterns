package DecoratorPatternStarbuzzCoffee;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Coffee almost as dark as my soul";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
