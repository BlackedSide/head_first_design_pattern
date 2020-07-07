package factory_pattern.store;

import factory_pattern.factory.NYPizzaIngredientFactory;
import factory_pattern.factory.PizzaIngredientFactory;
import factory_pattern.pizza.CheesePizza;
import factory_pattern.pizza.ClamPizza;
import factory_pattern.pizza.Pizza;

public class NYStyleStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
