package OopsConceptsPart2;

public interface UsBAnk {

	int min_bal = 1000;  //This is by default an static variable and can be called by eiher classname/interface name.
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	//Interface would have only method declaration and no method body
	//If we put method body it will throw error
	//In interface we can declare the variable.It's final or constant in nature.
	//In interface the variable is by default static and value of the variable will not be changed.
	//There can not be a static method in interface because interface is part of object oriented programming concept and 
	//Interface can not have a static method(Java 8 i guess has static method). We also can not have a main method in interface.
	//Interfaces are abstract in nature We can not create the object of interface.
	
}
 
