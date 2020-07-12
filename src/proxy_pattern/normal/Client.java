package proxy_pattern.normal;

public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);

        proxySubject.doSomething();
    }
}
