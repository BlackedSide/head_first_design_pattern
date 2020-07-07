package decorator_pattern.tip;

import decorator_pattern.beverage.Espresso;
import decorator_pattern.beverage.HouseBlend;
import decorator_pattern.condiment.Milk;
import decorator_pattern.condiment.Mocha;
import decorator_pattern.condiment.Whip;
import decorator_pattern.standard.Beverage;

public class StarCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
