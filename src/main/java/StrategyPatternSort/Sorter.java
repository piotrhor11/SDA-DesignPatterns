package StrategyPatternSort;

public final class Sorter {                         //final - po tej klasie nic nie dziedziczy

    private ISort sorter;
    private int[] data;
    private int[] result;

    public Sorter(ISort sorter) {
        setSorter(sorter);
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getResult() {
        return result;
    }

    public void setSorter(ISort sorter) {
        this.sorter = sorter;
    }

    public void doSorting() {
        result = sorter.sort(data);
    }
}
