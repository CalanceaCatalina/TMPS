package Composite_Decorator.Abstracts.Classes;

import Composite_Decorator.Abstracts.Boxes;
import Composite_Decorator.Interfaces.IBoxes;

import java.util.ArrayList;
import java.util.List;

public class Paper_Bag extends Boxes { //concrete decorator//composite

    private List<Boxes> child = new ArrayList<>();

    public Paper_Bag(IBoxes box) {
        super(box);
    }

    @Override
    public float GetCost() {

        var price = _box.GetCost() +7F;
        return price;
    }
    @Override
    public String Display() {
        String name ="Paper Bag";
        System.out.println(name);
        child.forEach(Boxes::Display);
        return name;
    }
    public void addBag(Boxes bag) {
        child.add(bag);
    }

    public void removeBag(Boxes bag) {
        child.remove(bag);
    }
}
