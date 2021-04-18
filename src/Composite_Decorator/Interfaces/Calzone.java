package Composite_Decorator.Interfaces;
import Composite_Decorator.Pizza;

public class Calzone implements IBoxes { //concrete component

    public Calzone(Pizza pizza){
        pizza.name = "calzone pizza - " + pizza.name;
    }

    @Override
    public float GetCost() {
        return 85F;
    }
}
