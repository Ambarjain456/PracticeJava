package OopsConcepts;

public class FunctionsInJava {
   //main method is the starting point of execution
	//if there is no object created inside the main method then no method will return any output 
	//to call all these methods we need an entity that will call these factories. We will create this object inside the main 
	
	public static void main(String[] args) {
		
	FunctionsInJava obj = new FunctionsInJava();
	//One object will be created and obj is the reference variable for this object.
	//After creating the object a copy of non static methods will be given to this object.
	//Object can not hold the static method.  
	//We never write return inside the main method hence we write void with main method.
	
	obj.test();
	int a = obj.pqr();  
	System.out.println(a);
	
	String y = obj.qa();
	System.out.println(y);
	
	int b =obj.divison(30, 10);
	System.out.println(b);
			
		// Non static method
		// when creating a method it should have return type- the data type of the value that method is returning.
	}	
	
	public void test ()// No input no output
	{ 
		System.out.println("test method"); 
	}
		public int pqr() //No input but some output
		{
			System.out.println("pqr method");
			
			int a= 10;
			int b=20;
			int c = a+b;
			
			return c;
		}
			
		public String qa() //return type String 
		{
		
			System.out.println("qa method");
			
			String x = "Selenium";
			
			return x;

	}
		
		public int divison(int x, int y)// x and y are the input parameters-- return type int
		{
			System.out.println("division methos");
			int d = x/y;
			return d;
			
		}
		}



