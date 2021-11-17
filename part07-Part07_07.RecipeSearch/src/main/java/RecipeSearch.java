import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        // Initialize Arrays for data input
        ArrayList<String> recipesInput = new ArrayList<>();
        ArrayList<Integer> indicies = new ArrayList<>();
        ArrayList<Recipe> recipesList = new ArrayList<>();

        // Read input from user for file to read for recipe list. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();

        // Start file Scanner and use a while loop to add all input rows into recipesInput ArrayList
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                recipesInput.add(row);
                if (row.isEmpty()) {
                    continue;
                }                
            }
        } catch (Exception e) {
            System.out.println("Unable to read file.");
        }

        // Manually add the first row to the indicies ArrayList, then iterate through the array to determine where a new recipe starts. 
        indicies.add(0);
        for (int i = 0; i < recipesInput.size(); i++) {
            if (recipesInput.get(i).isEmpty()) {
                indicies.add(i + 1);
            }
        }
        // For Each loop to iterate of each index, there should be one index for the start of each new recipe. 
        for (int index : indicies) {
            // Initialize variables for recipe contstructor
            String recipeName = recipesInput.get(index);
            int recipeCookTime = Integer.valueOf(recipesInput.get(index + 1));
            ArrayList<String> ingredients = new ArrayList<>();

            // For loop starts at the line after the cooking time, and ends at the next empty line, adds all ingredients to an array. 
            for (int i = index + 2; i < recipesInput.size(); i++) {
                if (recipesInput.get(i).isEmpty()) {
                    break;
                } else {
                    ingredients.add(recipesInput.get(i));
                }
            }
            // Construct recipe based on previously created variables. 
            recipesList.add(new Recipe(recipeName, recipeCookTime, ingredients));
            
        }

        // List command Options
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        // Start infinite loop for input
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipesList) {
                    System.out.println(recipe.listRecipe());
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchTerm = scanner.nextLine();
                for (Recipe recipe : recipesList) {
                    if (recipe.getName().contains(searchTerm)) {
                        System.out.println(recipe.listRecipe());
                    }
                }
                System.out.println("");
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipesList) {
                    if (recipe.getCookingTime() <= time) {
                        System.out.println(recipe.listRecipe());
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingedient:");
                String ingredient = scanner.nextLine();
                for (Recipe recipe : recipesList) {
                    recipe.recipeContainsIngredient(ingredient);
                }
            }

        }

    }

}
