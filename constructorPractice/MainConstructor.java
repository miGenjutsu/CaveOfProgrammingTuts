class Vehicle {
    private String carModel;
    private String carMake;
    private String carColor;

    public Vehicle() {
        carModel = "Acura";
        carMake = "RSX";
        carColor = "White";
    }

    public Vehicle(String carModel, String carMake, String carColor){
        this.carModel = carModel;
        this.carMake = carMake;
        this.carColor = carColor;
    }

    public String getCarModel(){
        return carModel;
    }

    public String getCarMake(){
        return carMake;
    }

    public String getCarColor() {
        return carColor;
    }

    public void changeCarModel(String newCarModel){
        carModel = newCarModel;
    }

    public void changeCarColor(String newCarColor) {
        carColor = newCarColor;
    }
}


public class MainConstructor {
    public static void main(String[] args) {
//      System.out.println("hello world!");

        Vehicle vehicle = new Vehicle();

      System.out.println("Car Model: "+vehicle.getCarModel());
      System.out.println("Car Make: "+vehicle.getCarColor());
      System.out.println("Car Color: "+vehicle.getCarColor());

        System.out.println("I want to change my cars color.....");
        System.out.println("... Processing ...");

        vehicle.changeCarColor("Black");
        System.out.println("New Car Color: "+vehicle.getCarColor());

    }
}

//TODO:
//> create a 'car' class
//> set in 'car' class a car name, car make, and car color
//> call from main
//> change the color of car