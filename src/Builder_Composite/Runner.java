package Builder_Composite;
import Singleton.Enum.*;

public class Runner {
    public static void main(String args[]) {

        Pizza pizza_Faraon = new BuilderPizza()
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

        Pizza pizza_Rusticana = new BuilderPizza()
                .addName("Rusticana")
                .addDough(Dough.PIZZA_DOUGH_CORNMEAL)
                .addSize(Size.MEDIUM)
                .addCrust(Crust.ITALIAN)
                .addCheese(Cheese.PROVOLONE)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addToppings(Toppings.BLACK_OLIVES)
                .Build();

        Pizza pizza_Calzone = new BuilderPizza()
                .addName("Calzone")
                .addDough(Dough.PIZZA_DOUGH_YEAST)
                .addSize(Size.CALZONE)
                .addCrust(Crust.CLASSIC)
                .addCheese(Cheese.MOZZARELLA)
                .addCheese(Cheese.CHEDDAR)
                .addToppings(Toppings.CHERRY_TOMATO)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .Build();


        Recipe recipeFaraon = new Recipe(pizza_Faraon);
        Recipe recipeRusticana = new Recipe(pizza_Rusticana);
        Recipe recipeCalzone = new Recipe(pizza_Calzone);

        RecipeBook pizza_classic = new RecipeBook("List of Pizza Classic Recipes:");
        pizza_classic.addRecipe(recipeFaraon);
        pizza_classic.addRecipe(recipeRusticana);

        pizza_classic.Display();
        System.out.println(PrepareMethod.getPreparationMethod().getMethod(pizza_Faraon));
        System.out.println(PrepareMethod.getPreparationMethod().getMethod(pizza_Rusticana));

        RecipeBook pizza_calzone = new RecipeBook("List of Pizza Calzone Recipes:");
        pizza_calzone.addRecipe(recipeCalzone);

        pizza_calzone.Display();
        System.out.println(PrepareMethod.getPreparationMethod().getMethod(pizza_Calzone));
    }
}
