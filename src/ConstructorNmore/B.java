package ConstructorNmore;

public class B extends A {
	
	public B()
	{
		super(10); //In this case when you run object B call constructor and see Super call which is in constructor A
		//it goes to the constructor A where it is written 
		
		System.out.println("Child class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(); 
		
      //so we do not need to call constructor specifically as soon as we create the object the constructor gets called.
		//Here as we run object B firstly look for constructor B but it also see that constructor B extends the constructor A.
		//Hence it firstly goes to constructor A and execute it,
	}

}
