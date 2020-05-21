package OopsConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		//at the compile time java will decide, which method do i need to call. hence this is called Static Polymorphism or
		//Compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.theftSafety();
		b.stop();
		b.refuel();
		b.engine();
		System.out.println("*******");
		
		
		//Parent cannot access the child class method.
		
		Car c = new Car();
		c.start();
		c.stop();
		//c.theftsafty can not be called as this is the child class method. Parent cant call the child class method.
		
		System.out.println("*******");
		//Top Casting-// Child class object can be referred by parent class reference variable-- this is called as dynamic polimorphism or run time polymorphism.
		
		Car c1 = new BMW();
		
	
	c1.start();
	c1.stop();
	c1.refuel();
	//c1.theftsafety still cant be run as it is chile class method but the reference variable is of parent class.
	
	
	//Down Casting
	
	BMW b1 = (BMW)new Car();
	}
//Method overloading is compile time polymorphism and over- ridding is run time polymorphism
}
   