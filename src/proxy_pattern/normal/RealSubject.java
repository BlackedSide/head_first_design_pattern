package proxy_pattern.normal;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("This is real doSomething.");
    }
}
