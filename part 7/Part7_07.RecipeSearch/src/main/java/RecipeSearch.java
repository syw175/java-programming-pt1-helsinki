
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int cookTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookTime, ingredients));
            }
        } catch (Exception e) {
            System.out.printf("Error reading the filename: " + file);
            System.exit(2);
        }


        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.println("\nEnter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("list")) {
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(search)) {
                        System.out.println(recipe);
                    }
                }
            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}
