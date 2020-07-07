package factory_pattern.order;

import factory_pattern.pizza.Pizza;
import factory_pattern.store.ChicagoStyleStore;
import factory_pattern.store.NYStyleStore;
import factory_pattern.store.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStyleStore();
        PizzaStore chicagoPizzaStore = new ChicagoStyleStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
