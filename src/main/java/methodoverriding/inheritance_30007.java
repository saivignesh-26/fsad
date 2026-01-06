package methodoverriding;

class Vehicle {
 void start() {
     System.out.println("Vehicle is starting");
 }
}


class Car extends Vehicle {
 void drive() {
     System.out.println("Car is being driven");
 }
}


class ElectricCar extends Car {
 void charge() {
     System.out.println("Electric car is charging");
 }
}
public class inheritance_30007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ElectricCar ec = new ElectricCar();

	        ec.start();  
	        ec.drive();  
	        ec.charge(); 

	}

}
