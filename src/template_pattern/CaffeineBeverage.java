package template_pattern;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();
    public abstract void addCondiments();

    public final void boilWater() {
        System.out.println("Boil water.");
    }

    public final void pourInCup() {
        System.out.println("Pour in the cup.");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
