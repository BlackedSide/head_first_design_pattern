package factory_pattern.store;

import factory_pattern.factory.ChicagoPizzaIngredientFactory;
import factory_pattern.factory.PizzaIngredientFactory;
import factory_pattern.pizza.CheesePizza;
import factory_pattern.pizza.ClamPizza;
import factory_pattern.pizza.Pizza;

public class ChicagoStyleStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }

        return pizza;
    }
}
