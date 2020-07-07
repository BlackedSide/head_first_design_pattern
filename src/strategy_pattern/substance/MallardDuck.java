package strategy_pattern.substance;

import strategy_pattern.behavior.FlyWithWings;
import strategy_pattern.behavior.Quack;

public class MallardDuck extends Duck {
    @Override
    void display() {
        System.out.println("Green head.");
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
