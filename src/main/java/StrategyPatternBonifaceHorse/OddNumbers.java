package StrategyPatternBonifaceHorse;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers implements ILogic {

    private List<Integer> answer;

    @Override
    public List<Integer> getNumbers(int max) {
        answer = new ArrayList<Integer>();
        for (int i = 1; i <= max; i++) {
            if (i % 2 != 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}
