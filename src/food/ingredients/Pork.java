package food.ingredients;

import food.Food;
import food.FoodType;

public class Pork extends Food {

    FoodType foodType = FoodType.MEAT;

    public Pork(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
