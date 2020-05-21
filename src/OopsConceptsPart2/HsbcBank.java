package OopsConceptsPart2;

public class HsbcBank implements UsBAnk,BrazilBank { //We are achieving multiple inheritance
	//Interface is also called is a relationship (relationship between interface and class)
	
	//Initial 3 methods we are overriding from US bank
	public void credit()
	{
		System.out.println("hsbc -- credit");
	}
	public void debit()
	{
		System.out.println("hsbc --- Debit");
	}
	public void transferMoney()
	{
		System.out.println("hsbc--- transfer money");
	}
	//Seperate methods of HSBC Bank
	public void homeloan()
	{
		System.out.println("hsbc --- home loan"); 
	}
	public void carLoan()
	{
		System.out.println("hsbc---Carloan");
		
	}
	//Overriding from Brazil Bank
	public void educationLoan()
	{
		System.out.println("hsbc--educationLoan");
	}

}
