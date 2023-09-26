package food.ingredients;

import food.Food;
import food.FoodType;

public class Perch extends Food {

    FoodType foodType = FoodType.FISH;

    public Perch(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
