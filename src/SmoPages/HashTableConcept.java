package SmoPages;

import java.util.Hashtable; 


public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Java");
		h.put("B", "Hello");
		h.put("C",  "World");
		
   System.out.println(h.size());
        h.put(1,  100);
        h.put( 2,  200);
        
        System.out.println(h.size());
        
        System.out.println(h.get(2));
        System.out.println(h.get("A"));
        
       h.put(3, "TOM");
       
      //SO key value pair can be any like integer, String/String, integer/Integer, Double
       //If we want to that key and value should only be of same data type then we have to create the object below way
       
       Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();
       
       h2.put(1, 800);
       //h2.put("A", 800) would give an error here as both the data type should be int.
       
       Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();
       h3.put(1, "Arseling");
           
   
	}

}
