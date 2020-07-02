package factory.order;

import factory.pizza.Pizza;
import factory.store.ChicagoStyleStore;
import factory.store.NYStyleStore;
import factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStyleStore();
        PizzaStore chicagoStore = new ChicagoStyleStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
