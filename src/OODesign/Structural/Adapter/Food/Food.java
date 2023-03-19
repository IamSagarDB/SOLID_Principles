package OODesign.Structural.Adapter.Food;

public class Food implements FoodItem{

    @Override
    public String getName() {
        return "Dosa";
    }

    @Override
    public Integer getPrice() {
        return 100;
    }

    @Override
    public String getRestaurantName() {
        return "UD";
    }
}

