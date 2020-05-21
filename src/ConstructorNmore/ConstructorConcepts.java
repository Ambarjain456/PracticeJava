package ConstructorNmore;

public class ConstructorConcepts {
	//its a class entity thats used to define the class features while creating object,
	//if you want to define the class features in form of global variable
	//it looks like a function but its not, it doesn't return any value
	//Constructor name should be same as class name.
	
	public ConstructorConcepts()//this is called default constructor cause we are not passing anything.
	{
		System.out.println("default cons");
	}
	public ConstructorConcepts(int i) {
		System.out.println("Single parameter cons");
		System.out.println("the value of i" + i);
		
	}
	public ConstructorConcepts(int i, int j)//this is called constructor overloading as we have the same name but different parameters
	{
		System.out.println("two parameter cons");
		System.out.println("the value of i" + i);
		System.out.println("the value of j" + j);
		
	}

	public static void main(String[] args) {
		// to call a constructor we just need to create an object inside main method we do not need to call specifically.
		
		ConstructorConcepts obj = new ConstructorConcepts();//This will call the default constructor.
		ConstructorConcepts obj1 = new ConstructorConcepts(10); // this will call single param constructor.
		ConstructorConcepts obj2 = new ConstructorConcepts(10, 20);//This will call two param constructor.
	}

}
