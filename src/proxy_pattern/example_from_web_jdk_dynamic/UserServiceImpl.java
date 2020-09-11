package proxy_pattern.example_from_web_jdk_dynamic;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("Add an user.");
    }

    @Override
    public void updateUser() {
        System.out.println("Update an user.");
    }
}
