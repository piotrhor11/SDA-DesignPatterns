package AdapterPatternTurkey;

public class TurkeyAdapter implements IDuck {                   //Adaptes turkeys to the ducks

    private ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
