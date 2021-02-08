package OCP;

import SRP.Prepare;
import Singleton.Enum.*;

public class Runner {
    public static void main(String[] args) {

        // prepararea pizzei diavola
        Prepare prepare_pizza = new Prepare()
                .addName("Diavola")
                .addDough(Dough.PIZZA_DOUGH)
                .addSize(Size.ITALIAN)
                .addCheese(Cheese.MOZZARELLA)
                .addToppings(Toppings.CHERRY_TOMATO)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addMagic(Magic.LOVE)
                .addMagic(Magic.SOUL);

        // crearea unei noi instante a clasei Italian_Pizza_Boxing (cutii conform marimei pizzei alese)
        // si ii atribuim pizza creata mai sus
        Italian_Pizza_Boxing italian_box = new Italian_Pizza_Boxing(prepare_pizza);
            italian_box.Boxing();
    }
}
