package decorator_pattern.beverage;

import decorator_pattern.standard.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
