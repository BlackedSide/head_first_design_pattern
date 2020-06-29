package strategy.substance;

import strategy.behavior.Quack;
import strategy.behavior.QuackBehavior;

public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void function() {
        quackBehavior.quack();
    }

    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall();
        duckCall.function();
    }
}
