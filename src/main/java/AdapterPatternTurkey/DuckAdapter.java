package AdapterPatternTurkey;

public class DuckAdapter implements ITurkey {

    private IDuck duck;

    public void DuckAdapter(IDuck duck) {
        this.duck = duck;
    }

    @Override
    public void fly() {
        duck.fly();
    }

    @Override
    public void gobble() {
        duck.quack();
    }
}
