package Prototype_AbstractFactory.Factories;
import Prototype_AbstractFactory.Boxes.Abstracts.Pizza_Box;
import Prototype_AbstractFactory.Boxes.Box_Type_Calzone;
import Prototype_AbstractFactory.Interfaces.IPizza;
import Prototype_AbstractFactory.Pizza.Abstracts.Pizza;
import Prototype_AbstractFactory.Pizza.Pizza_Calzone;
import Singleton.Enum.Size;

public class Pizza_Calzone_Factory implements IPizza {
    @Override
    public Pizza Prepare_Pizza() {
        return new Pizza_Calzone();
    }

    @Override
    public Pizza_Box Package(Size size) {
             return new Box_Type_Calzone();
     }
}
