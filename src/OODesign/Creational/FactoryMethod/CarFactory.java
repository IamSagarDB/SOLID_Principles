package OODesign.Creational.FactoryMethod;

public class CarFactory {

    public static Car createCar(String type, String model, String year, String color, String brand) throws Exception {
        if (type.equals("EV")) {
            return new ElectricCar(model, year, color, brand);
        }else if (type.equals("NONEV")) {
            return new NonEvCar(model, year, color, brand);
        }else {
            throw new Exception("Car Type Not Found");
        }
    }
}
