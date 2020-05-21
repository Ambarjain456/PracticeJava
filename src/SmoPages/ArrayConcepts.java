package SmoPages;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Below are one dimension array
		
		//Disadvantage of array
		// Size is fixed- static array- to overcome this problem we use collections arraylist or hastable
		//stores only similar data type - to overcome this problem we use object array
		
		
		int i[]= new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[3] = 30;
		
		
		/*
		 * System.out.println(i[3]); System.out.println(i.length);
		 */
		
		for( int k=0; k<4; k++)
		{
		System.out.println(i[k]);
		}
		
		double d[] = new double[3];
		
	d[0] = 1.11;
	d[1] = 2.22;
	d[2] = 3.33;
	
	for( int z= 0; z<3; z++) {
		System.out.println(d[z]);
		
	int y[] = new int[3];
	
	y[0]= 1;
	y[1] = 2;
	y[2] = 3;
	
	System.out.println(y[2]);
	
	
	char c[]= new char[3];
	
	c[0] ='q';
	c[1] = 'w';
	c[2] = 'e';
	
	for (int u=0; u<3; u++) {
		System.out.println(c[u]);
		
		
		String s[] = new String[3];
		
			s[0] = "Hello";
		    s[1] = "World";
		    s[2] = "Ambar";
		    
		    System.out.println(s[1]);
		    
		    for ( int r=0; r<3; r++) {
		    	System.out.println(s[r]);
		    	
		    }
		    
		    Object ob[] = new Object[6];
		    ob[0] = "TOM";
		    ob[1] = 28 ;
		    ob[2] = 1990;
		    ob[3] = "Clear";
		    ob[4] ="1/1/1910";
		    ob[5] = "male";
		    
		    System.out.println(ob[2]);
	
	}
	
		
		
	}
		
}
}