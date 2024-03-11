package lab;

// Write a Java program to create a vehicle class hierarchy. The base class should 
// be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have 
// properties such as make, model, year, and fuel type. Implement methods for 
// calculating fuel efficiency, distance traveled, and maximum speed.

public class Q6 {
    public static void main(String[] args){
        car c1 = new car("Toyota", "Etios", 2019, "Petrol");
        truck t1 = new truck("Ford", "F150", 2020, "Diesel");
        Motorcycle m1 = new Motorcycle("Honda", "M1022", 2018, "Petrol");
        System.out.println("The fuel efficency of the truck is :"+t1.calculateFuelEff(500,50)+" km/l");
        System.out.println("The the distance travelled by car :"+ c1.calculateD(30,20)+" kms");
        System.out.println("The max speed is of the motorcycle is :"+m1.calculateMaxSpeed(50,5));
    }
}

class vehicle{
    String make;
    String model;
    int year;
    String fuelType;
    public vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    //calculate fuel efficiency
    public double calculateFuelEff(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }

    //calculate distance traveled
    public double calculateD(double speed, double time) {
        return speed * time;
    }

    //calculate maximum speed
    public double calculateMaxSpeed(double enginePower, double weight) {
        return enginePower / weight;
    }
}

class truck extends vehicle{
    public truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    
}

class car extends vehicle{
    public car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Motorcycle extends vehicle{
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    } 
}


