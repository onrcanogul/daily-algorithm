package challanges.day3;

import java.util.*;

public class BakerProblem {
    //Pete likes to bake some cakes. He has some recipes and ingredients. Unfortunately he is not good in maths. Can you help him to find out, how many cakes he could bake considering his recipes?
    //
    //Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns the maximum number of cakes Pete can bake (integer). For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). Ingredients that are not present in the objects, can be considered as 0.
    public static void main(String[] args) {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        System.out.println(cakes(recipe, available));
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> possibilityCounts = new ArrayList<>();
        for (String key : recipe.keySet()) {
            Integer recipeValue = recipe.get(key);
            Integer availableValue = available.get(key);
            if (recipeValue != null && availableValue == null) return 0;
            if (recipeValue == null && availableValue != null) continue;
            possibilityCounts.add(availableValue / recipeValue);
        }
        return Collections.min(possibilityCounts);
    }
}
