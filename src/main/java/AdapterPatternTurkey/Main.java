package AdapterPatternTurkey;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        ArrayList<IDuck> birds = new ArrayList<>();
        birds.add(duck);
        birds.add(turkeyAdapter);

        runQuackingAndFlying(birds);

    }

    public static void runQuackingAndFlying(ArrayList<IDuck> birds) {
        for (IDuck duck : birds) {
            duck.quack();
            duck.fly();
        }

    }

}
