package OopsConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(UsBAnk.min_bal);
	
		HsbcBank hs = new HsbcBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.homeloan();
		hs.carLoan();
		
		//Dynamic polymorphism= child class object can be reffered by parent class reference variable.
		
		UsBAnk b = new HsbcBank();
		
		b.credit();
		b.debit();
		b.transferMoney();
		//b.homeloan() will give error as the parent class reference variable can not use child class properties.

	}

}
