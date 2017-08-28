package StrategyPatternSort;

public class Main {

    public static void main(String[] args) {

        Sorter sorterek = new Sorter(new SortBubble());
        sorterek.setData(new int[]{2, 3, 1, 9, 3, 7, 2, 3, 3});
        sorterek.doSorting();
        int[] wynik = sorterek.getResult();

        for (int i : wynik) {
            System.out.printf("%d, ", i);
        }
    }
}
