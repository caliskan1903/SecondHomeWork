package objectFirst;

public class Human {

	
	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodType;
	
	void eat() {
		System.out.println(name + " eats alot");
		
	}
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
	
	void walk() {
		System.out.println(name + " with bloodtype " + bloodType + " is walking");
	}
	
	void sendMemes() {
		if(name.equals("Irena")) {
			System.out.println("sending memes");
		}
	}
	
}
