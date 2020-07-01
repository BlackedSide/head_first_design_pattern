package decorator.tip;

import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Milk;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;
import decorator.standard.Beverage;

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
