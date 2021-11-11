package objectFirst;

public class Car {

	String model;
	String make;
	String color;
	int year;
	double milage;
	
	void moveForward() {
		System.out.println("moving forward");
		applyBreaks(); // its possible we are calling method
	}
	
	void applyBreaks() {
		System.out.println("appyling breaks"); // we are defining method
	}
	public static void main(String[] args) {
		
		Car gokhanCar =new Car();
		gokhanCar.make="BMW";
		gokhanCar.model="7 series";
		gokhanCar.color="black";
		System.out.println("gokhan car is " + gokhanCar.make);
		System.out.println("gokhan car model is " + gokhanCar.model);
		System.out.println("gokhan car color is " + gokhanCar.color);
		
		gokhanCar.moveForward();
		gokhanCar.applyBreaks();
		
		
	}
	
	
}
