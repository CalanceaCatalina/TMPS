package Builder;
import Singleton.Enum.*;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public String name;
    public Dough dough;
    public Size size;
    public Crust crust;
    public List<Cheese> cheese;
    public List<Toppings> toppings;
    public List<Magic> magic;

    public Pizza(){
        cheese =  new ArrayList<>();
        toppings =  new ArrayList<>();
        magic  =  new ArrayList<>();
    }
}
