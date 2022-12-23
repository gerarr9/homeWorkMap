import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes = new HashSet<>();

    public  void add(Recipe recipe){
        recipes.add(recipe);
    }
}
