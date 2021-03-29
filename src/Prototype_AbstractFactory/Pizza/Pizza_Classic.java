package Prototype_AbstractFactory.Pizza;

import Prototype_AbstractFactory.Pizza.Abstracts.Pizza;

public class Pizza_Classic extends Pizza{
    public Pizza_Classic(){}

    @Override
    public void Bake() {
        System.out.println("Pizza was baked at 280 degrees Celsius, for 30 minutes, into a wood oven. ");
    }

    @Override
    public Pizza Clone() {
        Pizza_Classic copy = new Pizza_Classic();
        copy.name = this.name;
        copy.dough= this.dough;
        copy.size = this.size;
        copy.crust = this.crust;
        copy.cheese = this.cheese;
        copy.toppings = this.toppings;
        copy.magic = this.magic;

        return copy;
    }
}
