package SmoPages;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100); // index 0
		ar.add(200);  //1
		ar.add(300);  //2
		
		System.out.println(ar.size());
		
		ar.add(400);  //3
		ar.add(500);  //4
		
		ar.add("TOM");   //5
		ar.add("12/12 1912");  //6
		ar.add(12.33);   //7
		ar.add("M");  //8
		ar.add(900); 
		
		System.out.println(ar.size());
		
		ar.remove(9);// this vill remove the value at index 9.
		//Arraylist can contain duplicate values.
		//These all values are stored at indexes like total 9 values entered from 0 to 8th index
		//If we want to fetch the 4th index value then we will use get method.
	
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9)); //This will give index out of bound exception as index 9 is not available
		
		//to Print all the values of arraylist we would need the for loop and we will use get method.
		
		for( int i=0;i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
			
		}
		//If we want that our arraylist should save only integer value then wat to do?
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Mom") -- this will give an error as now it will only allow to add integer value
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Efron");
		//ar2.add(100);-- This is integer hence it wont allow to add as this object allows only strings
		
		
		
	}

}
