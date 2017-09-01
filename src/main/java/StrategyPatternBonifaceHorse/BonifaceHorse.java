package StrategyPatternBonifaceHorse;

import java.util.List;

public class BonifaceHorse {

    private ILogic logic;
    private int max;
    private List<Integer> answer;

    public BonifaceHorse(int max) {
        this.max = max;
    }

    public void setLogic(ILogic logic) {
        this.logic = logic;
    }

    public void printNumbers() {
        answer = logic.getNumbers(max);
        for (int number : answer) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }
}
