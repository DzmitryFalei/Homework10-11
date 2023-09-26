package food.ingredients;

import food.Food;
import food.FoodType;

public class Flour extends Food {

    FoodType foodType = FoodType.UNKNOWN;

    public Flour(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
