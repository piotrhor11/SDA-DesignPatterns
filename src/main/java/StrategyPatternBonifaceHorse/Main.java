package StrategyPatternBonifaceHorse;

public class Main {

    public static void main(String[] args) {

        ILogic logic1 = new EvenNumbers();
        ILogic logic2 = new OddNumbers();

        BonifaceHorse kon = new BonifaceHorse(100);
        kon.setLogic(logic1);
        kon.printNumbers();
        kon.setLogic(logic2);
        kon.printNumbers();

    }
}
