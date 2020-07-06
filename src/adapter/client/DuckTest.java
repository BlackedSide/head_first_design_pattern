package adapter.client;

import adapter.adapter.TurkeyAdapter;
import adapter.target.Duck;
import adapter.target.MallardDuck;
import adapter.target.WildTurkey;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck says...");
        testDuck(duck);

        System.out.println("TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
