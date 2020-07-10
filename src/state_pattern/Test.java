package state_pattern;

public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(0);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
