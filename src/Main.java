import food.Dish;
import food.ingredients.Apple;
import food.ingredients.Onion;
import food.ingredients.Pork;


public class Main {
    public static void main(String[] args) {

        UniversalArray<String> stringUniversalArray = new UniversalArray<String>();
        stringUniversalArray.setItem(3,"Vacation");

        System.out.println("Task 2");

        Pair<String> stringPair = new Pair<>("Paranoid", "Master");
        System.out.println(stringPair.first());
        System.out.println(stringPair.last());
        stringPair.swap();
        System.out.println(stringPair.first());
        System.out.println(stringPair.last());
        stringPair.replaceLast("Key");
        System.out.println(stringPair.first());
        System.out.println(stringPair.last());


        System.out.println("Task 5");

        Dish pigInApples = new Dish();
        Apple apple = new Apple("Antonovka");
        Pork pork = new Pork("Lard");
        Onion onion = new Onion("Red");
        pigInApples.addIngredients(apple);
        pigInApples.addIngredients(pork);
        pigInApples.addIngredients(onion);
        apple.setName("White");
        System.out.println("New name: " + apple.getName());

        if (pigInApples.isVegetarian(pigInApples.getFoods())) {
            System.out.println("This food is vegetarian");
        } else {
            System.out.println("This food is not vegetarian");
        }

        System.out.println("Task 4");

        Integer[][] matrix = {{1, 2, 5}, {1, 8}, {9, 6, 3}};

        TwoDimArray<Integer> dimArray = new TwoDimArray<>(matrix);
        while (dimArray.hasNext())              {
            System.out.println(dimArray.next());
        }
    }
}