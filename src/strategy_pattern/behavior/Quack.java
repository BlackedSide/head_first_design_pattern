package strategy_pattern.behavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack like kua kua.");
    }
}
