package objectFirst;
import java.util.Scanner;
public class HumanTester {

	public static void main(String[] args) {
		
		Human gokhan=new Human();
		gokhan.name="gokhan";
		gokhan.age=29;
		gokhan.height=1.77;
		gokhan.weight=80;
		gokhan.gender='M';
		gokhan.bloodType="A+";
		
		
		gokhan.eat();
		gokhan.sleep();
		gokhan.walk();
		gokhan.sendMemes();
		System.out.println("----------------------------------");
		
		Human Irena =new Human();
		Irena.age=30;
		Irena.bloodType="B+ ";
		Irena.gender='F';
		Irena.height=1.65;
		Irena.name="Irena";
		Irena.weight=55;
		Irena.bloodType="A+ ";
		
			
		
		Irena.eat();
		Irena.sleep();
		Irena.walk();
		Irena.sendMemes();
		System.out.println(Irena.age);
		System.out.println(Irena.weight);
		
		
		
		Scanner input = new Scanner (System.in);
		
		
		
		
		
		
		
		

	}

}
