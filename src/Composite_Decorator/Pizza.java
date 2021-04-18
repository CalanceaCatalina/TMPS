package Composite_Decorator;
import Singleton.Enum.*;
import java.util.ArrayList;
import java.util.List;

//in pizza sunt declarate toate ingredientele de care avem nevoie
public class Pizza {
    public String name;
    public Dough dough;
    public Size size;
    public Crust crust;
    public List<Cheese> cheese =  new ArrayList<>();
    public List<Toppings> toppings =  new ArrayList<>();
    public List<Magic> magic =  new ArrayList<>();

    public Pizza(){
    }
}

