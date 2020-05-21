 package OopsConcepts;

public class CallByRefAndCallByVal {
   int p;
   int q;
   
	public static void main(String[] args) {
		
		CallByRefAndCallByVal obj = new CallByRefAndCallByVal();
	
		int x = 10;
		int y = 20;
		obj.testSum(x,y);//Call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int testSum(int a, int b)
	{
		 a = 30;
		 b = 40;
		int c = a+b;
		
		return c;
	}

	
	//Call by ref
	public void swap (CallByRefAndCallByVal t)
	{
		int temp;
		temp = t.p  ;// temp = 50
				t.p = t.q ; //t.p = 60
				t.q = temp; //t.q = 50
		
	}

}
