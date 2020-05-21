package OopsConcepts;

public class LocalvsGlobalVariables {
	//Variables created under this class will be global variables and can be accessed throughout the program.

	String name = "Ambar";
	int age = 25;
	
	public static void main(String[] args) {
		//Variable created under the main method will be the local variable and can be used within the scope of the method.

		 int i = 67;// this i is local variable for main method.
		 System.out.println(i);
		 //If we want to access the global variable here we need to create the object of the main class and then use it
		 //As soon as the object of class is created a copy of global variables and the non static methods is created inside that object.
		 //Hence with the help of the object we can call the global variable to the non static methods.
		 
		 LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		 System.out.println(obj.name);
		 System.out.println(obj.age);
		 
	}

	public double sum() {
		int i = 78; //this i is the local variable for sum method;
		double x= 21.5;
		double y = 53.1;
		double z = x+y;
		int age = 25;
		return z;
	}
}
