package Composite_Decorator.Interfaces;//Clasa BuilderPizza - reprezintă modul de preparare al pizzei
// (selectarea tipului aluatului, mărimea pizzei, topping-urile dorite, etc).
//in builder noi construim pizza

import Composite_Decorator.Pizza;
import Singleton.Enum.*;

public class Builder_Recipe {

    //crearea unei unui nou obiect de tip pizza pentru a-l construi mai departe
    private Pizza pizza = new Pizza();

    public Builder_Recipe addName(String name){
        pizza.name=name;
        return this;
    }

    public Builder_Recipe addDough(Dough dough) {
        pizza.dough = dough;
        return this;
    }
    public Builder_Recipe addCrust(Crust crust) {
        pizza.crust = crust;
        return this;
    }
    public Builder_Recipe addSize(Size size) {
        pizza.size = size;
        return this;
    }

    public Builder_Recipe addCheese(Cheese cheese) {
        pizza.cheese.add(cheese);
        return this;
    }

    public Builder_Recipe addToppings(Toppings toppings) {
        pizza.toppings.add(toppings);
        return this;
    }

    public Builder_Recipe addMagic(Magic magic) {
        pizza.magic.add(magic);
        return this;
    }

    //instanta clasei builder, care returneaza rezultatul - obiectul care deja are ingredientele setate
    public Pizza Build(){ return pizza; }
}