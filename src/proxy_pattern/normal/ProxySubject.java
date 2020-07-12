package proxy_pattern.normal;

public class ProxySubject implements Subject {
    private Subject mySubject;

    public ProxySubject(Subject mySubject) {
        this.mySubject = mySubject;
    }

    @Override
    public void doSomething() {
        mySubject.doSomething();
    }
}
