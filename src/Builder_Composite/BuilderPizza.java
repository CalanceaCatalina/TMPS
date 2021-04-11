package Builder_Composite;

import Singleton.Enum.*;
//Clasa BuilderPrepare - reprezintă modul de preparare al pizzei
// (selectarea tipului aluatului, mărimea pizzei, topping-urile dorite, etc).
//in builder noi construim pizza

public class BuilderPizza {

    //crearea unei unui nou obiect de tip pizza pentru a-l construi mai departe
        private Pizza pizza = new Pizza();

        public BuilderPizza addName(String name){
            pizza.name=name;
            return this;
        }

        public BuilderPizza addDough(Dough dough) {
            pizza.dough = dough;
            return this;
        }
        public BuilderPizza addCrust(Crust crust) {
            pizza.crust = crust;
            return this;
        }
        public BuilderPizza addSize(Size size) {
            pizza.size = size;
            return this;
        }

        public BuilderPizza addCheese(Cheese cheese) {
            pizza.cheese.add(cheese);
            return this;
        }

        public BuilderPizza addToppings(Toppings toppings) {
            pizza.toppings.add(toppings);
            return this;
        }

        public BuilderPizza addMagic(Magic magic) {
            pizza.magic.add(magic);
            return this;
        }

        //instanta clasei builder, care returneaza rezultatul - obiectul care deja are ingredientele setate
        public Pizza Build(){ return pizza; }
}
