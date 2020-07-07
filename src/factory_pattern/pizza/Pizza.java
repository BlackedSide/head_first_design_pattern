package factory_pattern.pizza;

import factory_pattern.ingredient.*;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name + " with " + dough + ", " + sauce + ", " + Arrays.toString(veggies) + ", " + cheese + ", " + pepperoni + ", " + clam;
    }

    public void setName(String name) {
        this.name = name;
    }
}