package food.ingredients;

import food.Food;
import food.FoodType;

public class Apple extends Food {

    FoodType foodType = FoodType.FRUIT;

    public Apple(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return foodType;
    }
}


