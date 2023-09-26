package food;

import food.FoodType;

public abstract class Food {

    private String name;
    public abstract FoodType getFoodType();

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}