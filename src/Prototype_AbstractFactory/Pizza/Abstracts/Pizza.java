package Prototype_AbstractFactory.Pizza.Abstracts;
import Singleton.Enum.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Size size;
    public Crust crust;
    public List<Cheese> cheese =  new ArrayList<>();
    public List<Toppings> toppings =  new ArrayList<>();
    public List<Magic> magic =  new ArrayList<>();

    public Pizza addName(String name){
        this.name=name;
        return this;
    }

    public Pizza addDough(Dough dough) {
        this.dough = dough;
        return this;
    }
    public Pizza addCrust(Crust crust) {
        this.crust = crust;
        return this;
    }
    public Pizza addSize(Size size) {
        this.size = size;
        return this;
    }

    public Pizza addCheese(Cheese cheese) {
        this.cheese.add(cheese);
        return this;
    }

    public Pizza addToppings(Toppings toppings) {
        this.toppings.add(toppings);
        return this;
    }

    public Pizza addMagic(Magic magic) {
        this.magic.add(magic);
        return this;
    }

    public String PrintRecipe(Pizza prepare) {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a typical pizza " + prepare.name + " of size ")
                .append(prepare.size)
                .append(" with")
                .append(prepare.dough)
                .append("\n");

        if (prepare.crust != null) {
            sb.append("Surrounded by a ")
                    .append(prepare.crust)
                    .append(" crust. ")
                    .append("\n");
        }

        if (prepare.cheese != null) {
            if (prepare.cheese.size() != 0) {
                sb.append("With softly and yummy ");
                for (int i = 0; i < prepare.cheese.size(); i++) {
                    sb.append(prepare.cheese.get(i));
                    if (i < prepare.cheese.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(" cheese. \n");
            }
        }

        if (prepare.toppings != null) {
            if (prepare.toppings.size() != 0) {
                sb.append("It has the following specialities on top: ");
                for (int i = 0; i < prepare.toppings.size(); i++) {
                    sb.append(prepare.toppings.get(i));
                    if (i < prepare.toppings.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(". \n");
            }
        }

        if (prepare.magic != null) {
            if (prepare.magic.size() != 0) {
                sb.append("And lastly, of course, it is made with lots of ");
                for (int i = 0; i < prepare.magic.size(); i++) {
                    sb.append(prepare.magic.get(i));
                    if (i < prepare.magic.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(". \n");
            }
        }
        return sb.toString();
    }

    public abstract void Bake();
    public abstract Pizza Clone();
}
