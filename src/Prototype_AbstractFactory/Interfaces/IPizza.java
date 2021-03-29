package Prototype_AbstractFactory.Interfaces;
import Prototype_AbstractFactory.Boxes.Abstracts.Pizza_Box;
import Prototype_AbstractFactory.Pizza.Abstracts.Pizza;
import Singleton.Enum.Size;

public interface IPizza {
    Pizza Prepare_Pizza();
    Pizza_Box Package(Size size);
}
