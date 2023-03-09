package OODesign.Creational.FactoryMethod;

public class NonEvCar extends Car{
    private String model;
    private String manufacturingYear;
    private String color;
    private String brand;

    public NonEvCar(String model, String manufacturingYear, String color, String brand) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String model() {
        return this.model;
    }

    @Override
    public String manufacturingYear() {
        return this.manufacturingYear;
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public String brand() {
        return this.brand;
    }

    @Override
    public void print() {
        String res = "ElectricCar{" +
                "model='" + model + '\'' +
                ", manufacturingYear='" + manufacturingYear + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
        System.out.println(res);
    }

    public String carType(){
        return "Non EV";
    }


}
