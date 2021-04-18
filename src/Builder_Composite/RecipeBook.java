package Builder_Composite;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook implements IRecipeBook { //composite

    private Pizza pizza;
    private String name;

    private List<IRecipeBook> Recipes;

    public RecipeBook(String name) {
        this.name = name;
        this.Recipes = new ArrayList<>();
    }

    @Override
    public void Display() {
        System.out.println(name);
        Recipes.forEach(IRecipeBook::Display);
        System.out.println("\n");
    }

    public void addRecipe(IRecipeBook recipe) {
        Recipes.add(recipe);
    }

    public void removeRecipe(IRecipeBook recipe) {
        Recipes.remove(recipe);
    }
}
