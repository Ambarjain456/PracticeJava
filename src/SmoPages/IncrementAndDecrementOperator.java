package SmoPages;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		// Post Increment
		// Value of i initially is 1 that is assigned to j so j=1
		//value of i incremented by 1 so i would be 2 so result would be 2  1
	
		int i = 1;
		int j = i++;
		System.out.println(i);
		System.out.println(j);
		
		//Pre Increment
		//This is pre increment so b would be ++a so b would store 1+1=2
		//a also would get 1+1 so value would be 2
		// so result would be 2  2
		
		int a =1;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		//Below is example of post decrement
		//Initial value od k is 2 L==k so l woud be assigned value 2 and then its decresed --
		//so assigned value to k is 1 so reslut would be 1    2
		
		int k = 2;
		int l = k--;
		System.out.println(k);
		System.out.println(l);
		
		
		int x = 2;
		int y = --x;
		
		System.out.println(x);
		System.out.println(y);
	
	}

}
