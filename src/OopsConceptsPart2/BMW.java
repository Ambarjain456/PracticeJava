package OopsConceptsPart2;

public class BMW extends Car {
	
	public void start() //Overridden method
	//When method is present in both parent class and child class with the same name and same no. of arguments
	//is called method overriding
	
	{
		System.out.println("BMW -- Start");
		
	}
	public void theftSafety()
	{
		System.out.println("BMW-- theftSafety");
	}

}
