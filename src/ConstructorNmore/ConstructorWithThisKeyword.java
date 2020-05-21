package ConstructorNmore;

public class ConstructorWithThisKeyword {
	String name;
	int age;
	//above mentioned class variables should be initialized and we would do that with this keyword
	
	public ConstructorWithThisKeyword(String name, int age)
	{
		//whenever you want to initialize your global variables with the current value of the constructor 
		this.name = name;
		this.age= age;
		
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 20);
		
	}

}
