package food;

import java.util.Objects;

public class Dish {

    private boolean isVegetarian = true;
    private static final int NUMBER_OF_INGREDIENTS = 8;

    private final Food[] foods = new Food[NUMBER_OF_INGREDIENTS];

    private int setOfIngredientsCurrentSize = 0;

    public void addIngredients(Food ingredients) {
        if (setOfIngredientsCurrentSize <= foods.length) {
            foods[setOfIngredientsCurrentSize] = ingredients;
            setOfIngredientsCurrentSize++;
        }
    }

    public boolean isVegetarian(Food[] foods) {

        for (int i = 0; i < setOfIngredientsCurrentSize; i++) {

            FoodType foodType = foods[i].getFoodType();
            if (Objects.requireNonNull(foodType) == FoodType.MEAT || foodType == FoodType.FISH || foodType == FoodType.MILK) {
                isVegetarian = false;
            }

        }
        return isVegetarian;
    }

    public Food[] getFoods() {
        return foods;
    }
}
