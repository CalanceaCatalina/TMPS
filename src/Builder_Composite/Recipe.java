package Builder_Composite;

public class Recipe implements IRecipeBook { //leaf

    private Pizza pizza;

    public Recipe(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public void Display() {
        System.out.println(pizza.name);
    }
}
