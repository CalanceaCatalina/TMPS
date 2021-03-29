package Prototype_AbstractFactory.Pizza;
import Prototype_AbstractFactory.Pizza.Abstracts.Pizza;

public class Pizza_Calzone extends Pizza {
    public Pizza_Calzone(){}

    @Override
    public void Bake() {
        System.out.println("Pizza was baked at 180 degrees Celsius, until nicely browned, into a wood oven. ");
    }

    @Override
    public Pizza Clone() {
        Pizza_Calzone copy = new Pizza_Calzone();
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
