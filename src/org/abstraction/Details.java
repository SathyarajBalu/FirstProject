package org.abstraction;

public class Details implements BankingDetails  {

	public void accName() {
		System.out.println("Raj");
	}
	public void accNum() {
		System.out.println("123456");
	}
	public void accMob() {
		System.out.println("9876543210");
	
	
	}
	
public static void main(String[] args) {
	Details details = new Details ();
			details.accName();
			details.accNum();
			details.accMob();	
}
}
