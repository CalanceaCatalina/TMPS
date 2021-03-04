package SRP;
import Singleton.Enum.*;

public class Main {

        public static void main(String[] args) {

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

            System.out.println(Prepare_Method_Ingredients.getPreparationMethod().getMethod(prepare_pizza));

            //am testat ca sa vedem daca se afiseaza corect ptu builder
            Prepare prepare_pizza_Margarita = new Prepare()
                    .addName("Margarita")
                    .addDough(Dough.PIZZA_DOUGH_YEAST)
                    .addSize(Size.MEDIUM)
                    .addCheese(Cheese.CHEDDAR);

            System.out.println(Prepare_Method_Ingredients.getPreparationMethod().getMethod(prepare_pizza_Margarita));
        }
    }
