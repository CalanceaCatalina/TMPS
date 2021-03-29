package Prototype_AbstractFactory.Factories;
import Prototype_AbstractFactory.Boxes.*;
import Prototype_AbstractFactory.Boxes.Abstracts.Pizza_Box;
import Prototype_AbstractFactory.Interfaces.IPizza;
import Prototype_AbstractFactory.Pizza.Abstracts.Pizza;
import Prototype_AbstractFactory.Pizza.Pizza_Classic;
import Singleton.Enum.Size;

public class Pizza_Classic_Factory implements IPizza {
    @Override
    public Pizza Prepare_Pizza() {
        return new Pizza_Classic();
    }

    @Override
    public Pizza_Box Package(Size size) {
        if (size == Size.MEDIUM){
            return new Box_Type_Medium();
        }
        else if (size == Size.ITALIAN){
            return new Box_Type_Italian();
        }
        else if (size == Size.LARGE){
            return new Box_Type_Large();
        }
        else return new Box_Type_Family();
    }
}

