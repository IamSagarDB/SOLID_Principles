package OODesign.Creational.FactoryMethod;

public class Client {
    public static void main(String[] args) throws Exception {
        Car car = CarFactory.createCar("EV","Nexon","2022","white","Tata");
        car.print();
        Car car1 = CarFactory.createCar("NONEV", "BMW Ev", "2023", "blue", "BMW");
        car1.print();
    }
}
