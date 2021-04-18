package Composite_Decorator;
import Composite_Decorator.Abstracts.Classes.BioPlastic_Bag;
import Composite_Decorator.Interfaces.*;
import Composite_Decorator.Abstracts.Classes.Leaf.Termo_Box;
import Composite_Decorator.Abstracts.Classes.Leaf.Cardboard_Box;
import Composite_Decorator.Abstracts.Classes.Paper_Bag;
import Composite_Decorator.Interfaces.Classic;
import Composite_Decorator.Interfaces.Calzone;
import Composite_Decorator.Interfaces.IBoxes;
import Singleton.Enum.*;

public class CD_Runner {
    public static void main(String[] args){

        Pizza pizza_Faraon = new Builder_Recipe()
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

        Pizza pizza_Rusticana = new Builder_Recipe()
                .addName("Rusticana")
                .addDough(Dough.PIZZA_DOUGH_CORNMEAL)
                .addSize(Size.MEDIUM)
                .addCrust(Crust.ITALIAN)
                .addCheese(Cheese.PROVOLONE)
                .addToppings(Toppings.MUSHROOM)
                .addToppings(Toppings.BASIL)
                .addToppings(Toppings.BLACK_OLIVES)
                .Build();

        Pizza pizza_Calzone = new Builder_Recipe()
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

        IBoxes classic = new Classic(pizza_Faraon);
        Cardboard_Box cardboard = new Cardboard_Box(classic);
        classic = cardboard;
        Paper_Bag paper = new Paper_Bag(classic);
        classic = paper;
        paper.addBag(cardboard);


        IBoxes calzone = new Calzone(pizza_Calzone);
        BioPlastic_Bag bioplastic = new BioPlastic_Bag(calzone);
        calzone = bioplastic;
        Termo_Box termo = new Termo_Box(calzone);
        bioplastic.addBag(termo);
        calzone = termo;

        System.out.println();
        System.out.println("Final price for "+pizza_Faraon.name +" is: "+ classic.GetCost()+" MDL.");
        System.out.println("Final price for "+pizza_Calzone.name +" is: "+ calzone.GetCost()+" MDL.");

        paper.Display();
        bioplastic.Display();
    }
}

