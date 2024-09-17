package OOPS.inheritance;

class Vehicle {
    public String name;
    public String color;
    public String model;
    public int price;
    private String bluePrint;

    void setCar(String nameOfCars, String color, String model, int price, String bluePrint)  {
        this.name = nameOfCars;
        this.color = color;
        this.model = model;
        this.price = price;
        this.bluePrint = bluePrint;
    }

    void showBluePirintDetailsToOthers(){
        System.out.println("I am manufacturare my self iam sharing blue print");
        System.out.println("\tThe blue print is ===" + bluePrint);
    }
}

// this is derived class from base class Vehicle
class Car extends Vehicle {
    void showCar() {
        System.out.println("This car inherites from vehicle");
        System.out.println("\tCar Name :" + name);
        System.out.println("\tCar model :" + model);
        System.out.println("\tCar color :" + color);
        System.out.println("\tCar price :" + price);
        // System.out.println("The blue Print of car " + bluePrint);
    }
}

// this derived class from class Car
class ElectricCar extends Car {
    void showElectricVehicle() {
        System.out.println("Electric car = ");
        System.out.println("\tCar Name :" + name);
        System.out.println("\tCar model :" + model);
        System.out.println("\tCar color :" + color);
        System.out.println("\tCar price :" + price);
    }
}

public class multilevel_inheritace {
    public static void main(String[] args) {

        ElectricCar obj = new ElectricCar();

        obj.setCar("BMW", "NavyBlue", "top model", 10000000, "bluePrintIsShared");
        obj.showBluePirintDetailsToOthers();
        obj.showCar();
        obj.showElectricVehicle();
    }
}
