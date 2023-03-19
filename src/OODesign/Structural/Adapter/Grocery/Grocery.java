package OODesign.Structural.Adapter.Grocery;

public class Grocery implements GroceryItem{
    @Override
    public String getName() {
        return "Ragi";
    }

    @Override
    public Integer getPrice() {
        return 40;
    }

    @Override
    public String getShopName() {
        return "BSK";
    }
}
