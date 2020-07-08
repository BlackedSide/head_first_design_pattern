package composite_pattern;

import composite_pattern.menu.Menu;
import composite_pattern.menu.MenuComponent;
import composite_pattern.menu.MenuItem;
import composite_pattern.waitress.Waitress;

public class Test {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));
        dinerMenu.add(new MenuItem(
                "Hot Dog",
                "Hot dog with salad",
                false,
                2.59
        ));

        dinerMenu.add(dessertMenu);

        pancakeMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        dessertMenu.add(new MenuItem(
                "Ice Cream",
                "Ice cream with your favourite favour",
                true,
                0.89
        ));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
