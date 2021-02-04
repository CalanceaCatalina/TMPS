package SRP;
import Singleton.Enum.*;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Prepare {
    public Dough dough;
    public Size size;
    public Crust crust;
    public List<Cheese> cheese =  new ArrayList<>();
    public List<Toppings> toppings =  new ArrayList<>();
    public List<Magic> magic  =  new ArrayList<>();

    public Prepare(){

    }
    public Prepare addDough(Dough dough) {
        this.dough = dough;
        return this;
    }
    public Prepare addCrust(Crust crust) {
        this.crust = crust;
        return this;
    }
    public Prepare addSize(Size size) {
        this.size = size;
        return this;
    }

    public Prepare addCheese(Cheese cheese) {
        this.cheese.add(cheese);
        return this;
    }

    public Prepare addToppings(Toppings toppings) {
        this.toppings.add(toppings);
        return this;
    }

    public Prepare addMagic(Magic magic) {
        this.magic.add(magic);
        return this;
    }
}
