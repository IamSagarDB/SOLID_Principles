package OODesign.Structural.Adapter.Grocery;

import OODesign.Structural.Adapter.Food.FoodItem;

public class GroceryAdapter implements FoodItem {
    private GroceryItem grocery;
    public GroceryAdapter(GroceryItem grocery){
        this.grocery = grocery;
    }
    @Override
    public String getName() {
        return grocery.getName();
    }

    @Override
    public Integer getPrice() {
        return grocery.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return grocery.getShopName();
    }
}
