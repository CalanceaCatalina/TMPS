package Builder;
import Singleton.Enum.*;

public class BuilderPrepare {

        private static Pizza preparepizza = new Pizza();

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

        public Pizza Build(){ return preparepizza; }
}
