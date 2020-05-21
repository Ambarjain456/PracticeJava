package OopsConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading ();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		

	}
	//Method Overloading- When method name is same with different parameters or arguments within the same class.
	
	public void sum()
	{
		System.out.println(" Sum Method-zero input param");
	}
	
	public void sum(int x)
	{
		System.out.println("sum method- with 1 input");
		System.out.println(x);
	}
	
	public void sum(int x, int y)
	{
		System.out.println("sum method with 2 parameters");
		System.out.println(x+y);
	}

}
 