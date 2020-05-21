package ListConcepts;

public class ChildClass extends ParentClass {

	public void start() //if we use the final keyword in the method then it will give an error that
	//final method from parent class can not be overridden.
	//to prevent the method overriding we use the final keyword before the method name.
	{
		System.out.println("Child Class-- Start");
	}
}
