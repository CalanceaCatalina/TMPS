package Composite_Decorator.Abstracts.Classes.Leaf;

import Composite_Decorator.Abstracts.Boxes;
import Composite_Decorator.Interfaces.IBoxes;

public class Cardboard_Box extends Boxes { //concrete decorator//leaf

    public Cardboard_Box(IBoxes box) {
        super(box);
    }
    @Override
    public String Display() {
        String name ="Cardboard Box";
        System.out.println(name);
        return name;
    }

    @Override
    public float GetCost() {

        var price = _box.GetCost() + 15F;
        return price;
    }


}

