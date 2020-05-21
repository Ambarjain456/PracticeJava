package ListConcepts;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// Arraylist is - Dynamic Array
		//Can contain duplicate values
		//maintains insertion orders
		//synchrosnised
ArrayList ar = new ArrayList();
		
		ar.add(100); // index 0
		ar.add(200);  //1
		ar.add(300);  //2
		
		System.out.println(ar.size());
		
		ar.add(400);  //3
		ar.add(500);  //4
		ar.add(500);
		
		
		  for( int i=0; i<ar.size(); i++)
		  { 
			  System.out.println(ar.get(i)); 
		  }
		 
		
		
		//Create the Employee objects
		
		Employee e1 = new Employee("TOM", 27, "IT");
		Employee e2= new Employee("Dick", 28, "Admin");
		Employee e3 = new Employee("Harry", 29, "HR");
		
		//Create ArrayList
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		 
				ar2.add(e1);
		        ar2.add(e2);
		        ar2.add(e3);
		        
		        //When we need to traverse the values of an object we will use the iterator.
		        
		        Iterator<Employee> it = ar2.iterator();
		        while(it.hasNext())
		        {
		        	Employee emp = it.next();
		        	
		        	System.out.println(emp.name);
		        	System.out.println(emp.age);
		        	System.out.println(emp.department);
		        }
		
		        System.out.println("******************");
		        
		        //addAll()
		        
		        ArrayList ar3 = new ArrayList();
		        ar3.add ("test");
		        ar3.add("selenium");
		        ar3.add("QTP");
		        
		        ArrayList ar4 = new ArrayList();
		        ar4.add("Jac");
		        ar4.add("Efron");
		        ar4.add("Junior");
		        
		        ar3.addAll(ar4);
		        
		        for( int k=1; k<ar3.size(); k++)
		        {
		        	System.out.println(ar3.get(k));
		        }
		        
		        //removeAll();
		        
		        ar3.removeAll(ar4);
		        
		        for( int k=1; k<ar3.size(); k++)
		        {
		        	System.out.println(ar3.get(k));
		        }
		
		
// retailAll() is used to print the common value between 2 arrayList. so let say if ar3 and ar4 noth have test then
		        ar3.retainAll(ar4); //will give common value between these 2 arrayList. 
	}

}
