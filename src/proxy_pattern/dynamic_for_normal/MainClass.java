package proxy_pattern.dynamic_for_normal;

import proxy_pattern.normal.RealSubject;
import proxy_pattern.normal.Subject;

import java.lang.reflect.Proxy;

public class MainClass {
    public static void main(String[] args) {
        // 委托类
        Subject realSubject = new RealSubject();
        // 委托类的ClassLoader
        ClassLoader myClassLoader = realSubject.getClass().getClassLoader();
        // 委托对应的ProxyHandler
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(realSubject);

        Class[] myClasses = new Class[]{Subject.class};

        // 代理类
        Subject proxySubject = (Subject) Proxy.newProxyInstance(myClassLoader, myClasses, dynamicProxyHandler);
        // 代理类调用方法
        proxySubject.doSomething();
    }
}
