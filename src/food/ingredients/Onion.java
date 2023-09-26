package food.ingredients;

import food.Food;
import food.FoodType;

public class Onion extends Food {

    FoodType foodType = FoodType.VEGETABLE;

    public Onion(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
