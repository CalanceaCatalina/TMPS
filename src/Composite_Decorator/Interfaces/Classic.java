package Composite_Decorator.Interfaces;

import Composite_Decorator.Pizza;

public class Classic implements IBoxes { //concrete component

    public Classic(Pizza pizza){
        pizza.name = "classic pizza - " + pizza.name;
    }

    @Override
    public float GetCost() {
        return 100F;
    }
}

