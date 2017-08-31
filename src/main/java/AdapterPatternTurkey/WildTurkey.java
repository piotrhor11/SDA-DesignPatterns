package AdapterPatternTurkey;

public class WildTurkey implements ITurkey {
    @Override
    public void fly() {
        System.out.println("I fly in the turkey way!");
    }

    @Override
    public void gobble() {
        System.out.println("I gobble!");
    }
}
