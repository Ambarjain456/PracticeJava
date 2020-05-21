package OopsConcepts;

public class StaticandNonStaticConcept {
	
	 String name = "Ambar";
	 static int age = 25;

	public static void main(String[] args) {
		// How can we call an static method.
		//1. Directly by the method name
		//2. We can call the static method with the class.
		//If we want to call static object we can call using the class.
		System.out.println(StaticandNonStaticConcept.age);
        sum();
        StaticandNonStaticConcept.sum();
		//if we wanna call the non static method we will call with the help of the object.
        
		StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
		
		obj.testmethod();
		
	}
	
	public static void sum()
	{
		System.out.println("Sum method");
		
	}

	public void testmethod()
	{
		System.out.println("test method");
	}
}
