package Prototype_AbstractFactory;
import Prototype_AbstractFactory.Boxes.Abstracts.Pizza_Box;
import Prototype_AbstractFactory.Factories.Pizza_Calzone_Factory;
import Prototype_AbstractFactory.Factories.Pizza_Classic_Factory;
import Prototype_AbstractFactory.Interfaces.IPizza;
import Prototype_AbstractFactory.Pizza.Abstracts.Pizza;
import Singleton.Enum.*;

public class AFP_Runner {
    public static void main(String[] args) {

        //====================================================
        IPizza Pizza_Classic_Factory = new Pizza_Classic_Factory();
        Pizza Faraon = Pizza_Classic_Factory.Prepare_Pizza();
        Faraon.addName("Faraon")
                .addDough(Dough.PIZZA_DOUGH)
                .addSize(Size.ITALIAN)
                .addCrust(Crust.CLASSIC)
                .addCheese(Cheese.MOZZARELLA)
                .addToppings(Toppings.CHERRY_TOMATO)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addMagic(Magic.LOVE)
                .addMagic(Magic.SOUL);
        Pizza_Box box = Pizza_Classic_Factory.Package(Faraon.size);

        box.setAddress("Alexei Mateevici", 2, 3, 42);
        box.FinishBoxing(box.getAddress(), Faraon.name);
        System.out.println(Faraon.PrintRecipe(Faraon));

            Pizza pizza2 = Faraon.Clone();
            Pizza_Box box2 = box.Clone();
            System.out.println("\n A FOST CLONAT!!!");
            box2.FinishBoxing(box2.getAddress(), pizza2.name);

        //====================================================
        IPizza Pizza_Calzone_Factory = new Pizza_Calzone_Factory();

        Pizza Calzone = Pizza_Calzone_Factory.Prepare_Pizza();
        Calzone.addName("Calzone")
                .addDough(Dough.PIZZA_DOUGH_YEAST)
                .addSize(Size.CALZONE)
                .addCrust(Crust.CLASSIC)
                .addCheese(Cheese.MOZZARELLA)
                .addCheese(Cheese.CHEDDAR)
                .addToppings(Toppings.CHERRY_TOMATO)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL);
        Pizza_Box box3 = Pizza_Calzone_Factory.Package(Calzone.size);

        box3.setAddress("Ion Creanga", 1, 3, 12);
        box3.FinishBoxing(box3.getAddress(), Calzone.name);
        System.out.println(Calzone.PrintRecipe(Calzone));

        //implementare prototype
//    Pizza_Classic pizza1 = (Pizza_Classic) new Pizza_Classic()
//            .addCheese(Cheese.MOZZARELLA)
//            .addToppings(Toppings.CHERRY_TOMATO);
//
//    Pizza_Calzone pizza2 = (Pizza_Calzone) new Pizza_Calzone()
//            .addCheese(Cheese.PROVOLONE)
//            .addToppings(Toppings.CHERRY_TOMATO);
//
//    Pizza_Calzone pizza3 = (Pizza_Calzone) pizza2.Clone();
//
//    System.out.println(pizza1.PrintRecipe(pizza1));
//    System.out.println(pizza3.PrintRecipe(pizza3));
//    System.out.println(pizza2.PrintRecipe(pizza2));
    }
}

