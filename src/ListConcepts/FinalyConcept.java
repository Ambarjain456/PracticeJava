package ListConcepts;

public class FinalyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//test1();
	//	test2();
		div();
	//Code inside Finally will definitely will be executed no matter what.
	}
	public static void test1()
	{
		try {
		System.out.println("inside test1 method");
		throw new RuntimeException("Test");
	}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("Inside Finally block");
		}
	}
	//Another example we will create a new method where we wont catch the exception.
	
	public static void test2()
	{
		try
		{
			System.out.println("Inside the method test2");
			//inside the try block there is no exception still it will call the finally block.
			//Doesnt matter any exception is coming or not finally block will be executed always.
		}
		finally
		{
			System.out.println("Finalyy inside the method test 2");
		}
	}
	
	//We will take 3rd example of devision method
	public static void div()
	{
		int i = 10;
		try
		{
			System.out.println("inside the try block");
			int k = i/0;
				
		}
		catch(ArithmeticException e)
		//If in place of arithmetic exception we use catch(NullPointerException e) then this wont be able to handle the 
		//exception. In this case we would get exception but we wont be able to handle this exception.
		//In this case as well finally would be running.
		//Like in selenium when we need to close the browser then inside finally block we will use driver.closeBrowser();
		{
			System.out.println("Inside Catch block");
			System.out.println("Devide by zero error");
		}
		finally
		{
			System.out.println("This will execute even after any exception");
		}
	}
}
	
		

