package strategy_pattern.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No voice.");
    }
}
