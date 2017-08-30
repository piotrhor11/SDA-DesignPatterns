package DecoratorPatternStarbuzzCoffee;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha (chocolate)";
    }
}
