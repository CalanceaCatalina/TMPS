package Builder;
import Singleton.Enum.*;
//Clasa BuilderPrepare - reprezintă modul de preparare al pizzei
// (selectarea tipului aluatului, mărimea pizzei, topping-urile dorite, etc).
//in builder noi construim pizza

public class BuilderPrepare {

    //crearea unei unui nou obiect de tip pizza pentru a-l construi mai departe
        private Pizza preparepizza = new Pizza();

        public BuilderPrepare addName(String name){
            preparepizza.name=name;
            return this;
        }

        public BuilderPrepare addDough(Dough dough) {
            preparepizza.dough = dough;
            return this;
        }
        public BuilderPrepare addCrust(Crust crust) {
            preparepizza.crust = crust;
            return this;
        }
        public BuilderPrepare addSize(Size size) {
            preparepizza.size = size;
            return this;
        }

        public BuilderPrepare addCheese(Cheese cheese) {
            preparepizza.cheese.add(cheese);
            return this;
        }

        public BuilderPrepare addToppings(Toppings toppings) {
            preparepizza.toppings.add(toppings);
            return this;
        }

        public BuilderPrepare addMagic(Magic magic) {
            preparepizza.magic.add(magic);
            return this;
        }

        //instanta clasei builder, care returneaza rezultatul - obiectul care deja are ingredientele setate
        public Pizza Build(){ return preparepizza; }
}
