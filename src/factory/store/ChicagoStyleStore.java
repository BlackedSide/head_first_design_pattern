package factory.store;

import factory.factory.ChicagoPizzaIngredientFactory;
import factory.factory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

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
