package Builder;
import Singleton.Enum.*;

public class Runner {
    public static void main(String[] args) {
        Pizza preparepizza_Faraon = new BuilderPrepare()
                .addName("Faraon")
                .addDough(Dough.PIZZA_DOUGH)
                .addSize(Size.ITALIAN)
                .addCrust(Crust.CLASSIC)
                .addCheese(Cheese.MOZZARELLA)
                .addToppings(Toppings.CHERRY_TOMATO)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addMagic(Magic.LOVE)
                .addMagic(Magic.SOUL)
                .Build();

        System.out.println(Prepare_Method.getPreparationMethod().getMethod(preparepizza_Faraon));

        Pizza preparepizza_Rusticana = new BuilderPrepare()
                .addName("Rusticana")
                .addDough(Dough.PIZZA_DOUGH_CORNMEAL)
                .addSize(Size.MEDIUM)
                .addCrust(Crust.ITALIAN)
                .addCheese(Cheese.PROVOLONE)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addToppings(Toppings.BLACK_OLIVES)
                .Build();

        System.out.println(Prepare_Method.getPreparationMethod().getMethod(preparepizza_Rusticana));

        Pizza preparepizza_Margarita = new BuilderPrepare()
                .addName("Margarita")
                .addDough(Dough.PIZZA_DOUGH_YEAST)
                .addSize(Size.MEDIUM)
                .addCrust(Crust.THIN_AND_CRISPY)
                .addCheese(Cheese.CHEDDAR)
                .Build();

        System.out.println(Prepare_Method.getPreparationMethod().getMethod(preparepizza_Margarita));
    }
  }

