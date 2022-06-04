import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return getName() + ", cooking time: " + getCookingTime();
    }
}
