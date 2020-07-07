package strategy_pattern.substance;

import strategy_pattern.behavior.Quack;
import strategy_pattern.behavior.QuackBehavior;

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
