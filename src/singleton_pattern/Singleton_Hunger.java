package singleton_pattern;

public class Singleton_Hunger {
    private static Singleton_Hunger instance = new Singleton_Hunger();

    private Singleton_Hunger() {}

    public static Singleton_Hunger getInstance() {
        return instance;
    }
}
