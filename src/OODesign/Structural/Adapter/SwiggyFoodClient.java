package OODesign.Structural.Adapter;

import OODesign.Structural.Adapter.Food.Food;
import OODesign.Structural.Adapter.Food.FoodItem;
import OODesign.Structural.Adapter.Grocery.Grocery;
import OODesign.Structural.Adapter.Grocery.GroceryAdapter;

import java.util.ArrayList;

public class SwiggyFoodClient {
    public static void main(String[] args) {
        ArrayList<FoodItem> foods = new ArrayList<>();

        foods.add(new Food());

       // foods.add(new Grocery()); // In-Compatible , so we need Adapter Design pattern to make it compatible
        foods.add(new GroceryAdapter(new Grocery()));

    }
}
