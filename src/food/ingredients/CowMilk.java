package food.ingredients;

import food.Food;
import food.FoodType;

public class CowMilk extends Food {

    FoodType foodType = FoodType.MILK;

    public CowMilk(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
