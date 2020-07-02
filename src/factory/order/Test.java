package factory.order;

import factory.pizza.Pizza;
import factory.store.ChicagoStyleStore;
import factory.store.NYStyleStore;
import factory.store.PizzaStore;

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
