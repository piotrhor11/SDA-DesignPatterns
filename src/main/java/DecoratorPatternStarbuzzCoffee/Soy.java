package DecoratorPatternStarbuzzCoffee;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Soy";
    }
}
