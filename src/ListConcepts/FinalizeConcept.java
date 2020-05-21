package ListConcepts;

public class FinalizeConcept {
	
	public void finalize()
	{
		System.out.println("Finalize Mthod");
	}
	
	public static void main (String[] args)
	{
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2= null;
		
		//Finalize keyword is used as garbage collector. We do not need to call the finalize method.
		//Finalize is basically used to perform the cleanup.
		//How to call garbage collector
		
		System.gc();
	}

}
