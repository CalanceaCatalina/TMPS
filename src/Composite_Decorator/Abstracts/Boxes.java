package Composite_Decorator.Abstracts;

import Composite_Decorator.Interfaces.IBoxes;

public abstract class Boxes implements IBoxes {
    // decorator din sablon Decorator //component din sablon Composite

    protected IBoxes _box;

    public Boxes(IBoxes box){
        _box = box;
    }

    public abstract float GetCost();
    public abstract String Display();
}
