package DecoratorPatternStarbuzzCoffee;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Some cheap shit we want to get rid of for a double price";
    }

    @Override
    public double cost() {
        return 12.49;
    }
}
