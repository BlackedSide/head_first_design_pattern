package factory.store;

import factory.factory.NYPizzaIngredientFactory;
import factory.factory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

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
