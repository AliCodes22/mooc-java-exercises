
        
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String fileName = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();



        try(Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();

                if(name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while(fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    
                    if(ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name,cookingTime, ingredients));
               
            }
        } catch(Exception error) {
            System.out.println("Errror" + error.getMessage());
        }

       while(true) {
        System.out.println("Enter command:");
        String command = scanner.nextLine();

        if(command.equals("list")){
            for(Recipe recipe: recipes) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
            }
        }

        if(command.equals("stop")) {
            break;
        }

        if(command.equals("find name")) {
            System.out.println("Searched word:");
            String word = scanner.nextLine();

            for(Recipe recipe: recipes) {
                String recipeName = recipe.getName();
                if(recipeName.contains(word)) {
                    System.out.println("Recipes:");
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                }
            }
        }

        if(command.equals("find cooking time")) {
            System.out.println("Max cooking time");
            int maxCookingTime = Integer.valueOf(scanner.nextLine());

            for(Recipe recipe: recipes) {
                if(recipe.getCookingTime() <= maxCookingTime) {
                    System.out.println("Recipes:");
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                }
            }
        }

        if(command.equals("find ingredient")) {
            System.out.println("Ingredient:");
            String ingredient = scanner.nextLine();

            for(Recipe recipe: recipes) {
                ArrayList<String> ingredients = recipe.getIngredients();

                if(ingredients.contains(ingredient)) {
                    System.out.println("Recipes:");
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                }

            }
        }
       }
    }

}
