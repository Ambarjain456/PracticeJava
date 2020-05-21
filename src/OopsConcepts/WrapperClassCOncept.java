package OopsConcepts;

public class WrapperClassCOncept {

	public static void main(String[] args) {
		// How do we do data conversion using wrapper class concept
		
		String x ="100";// I want to convert this string into integer.
		System.out.println(x+20);
		//This will give output as 10020 but i want to convert this 100 into integer first 
		//We will use a wrapperClass that in integer
		
		int i = Integer.parseInt(x); // In parseInt we are passing the string that is converting the string into integer and 
		//we are storing this integer in variable i
		System.out.println(i+20);
		
		//We have wrapper classes for Integer, character, double, boolean
		
		String y = "12.33";
		double d =	Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to Boolean conversion
		String k = "true";
		Boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
	     //integer to string conversion  
		int a = 200;
		System.out.println(a+20);
		
		String c = String.valueOf(a);
		System.out.println(c+20);
		
		String u = "100A";
		Integer.parseInt(u); //we will get  java.lang.NumberFormatException as 100A is not pure integer
		
		
	} 

}
 