package DecoratorPatternStarbuzzCoffee;

public class Main {

    public static void main(String[] args) {
        Beverage kawa1 = new HouseBlend();
        kawa1 = new Milk(kawa1);
        kawa1 = new Mocha(kawa1);
        System.out.printf("Twoja kawa to %s i kosztuje %.2f zł.\n", kawa1.getDescription(), kawa1.cost());

    }
}
