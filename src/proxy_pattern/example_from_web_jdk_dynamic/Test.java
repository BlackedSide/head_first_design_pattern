package proxy_pattern.example_from_web_jdk_dynamic;

public class Test {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        UserService userService = (UserService) dynamicProxy.bind(new UserServiceImpl());
        userService.addUser();
        userService.updateUser();
    }
}
