package factory.store;

import factory.pizza.NYStyleCheesePizza;
import factory.pizza.Pizza;

public class NYStyleStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
