package factory.store;

import factory.pizza.ChicagoStyleCheesePizza;
import factory.pizza.Pizza;

public class ChicagoStyleStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
