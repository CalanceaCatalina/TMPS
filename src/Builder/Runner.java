package Builder;

import Singleton.Enum.*;

public class Runner {
    public static void main(String[] args) {
        Pizza preparepizza = new BuilderPrepare()
                .addName("Faraon")
                .addDough(Dough.PIZZA_DOUGH)
                .addSize(Size.ITALIAN)
                .addCheese(Cheese.MOZZARELLA)
                .addToppings(Toppings.CHERRY_TOMATO)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addMagic(Magic.LOVE)
                .addMagic(Magic.SOUL)
                .Build();

        System.out.println(Prepare_Method.getPreparationMethod().getMethod(preparepizza));
    }
  }

