import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredientList;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredientList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public String getName() {
        return this.name;
    }

    public String listRecipe() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    public void recipeContainsIngredient(String searchTerm) {
        for (String ingredient : this.ingredientList) {
            if (ingredient.equals(searchTerm)) {
                System.out.println(this.listRecipe());
            }
        }
    }

    public String toString() {
        String outString = "Name: " + this.name + "\n";
        outString += "Cooking Time: " + this.cookingTime + "\n";
        outString += "Ingredients: \n";
        for (String ingredient : this.ingredientList) {
            outString += " - " + ingredient + "\n";
        }
        return outString;
    }
}
