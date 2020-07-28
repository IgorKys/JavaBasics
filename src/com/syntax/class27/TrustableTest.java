package com.syntax.class27;

public class TrustableTest {
	
	public static void main(String[] args) {
		
		Trustable t = new PNC();
		t.trust();
		
		
		Bank b = new PNC();
		b.trust();
		b.deposit();
		b.withdraw();
		
		
		Mortgage m = new PNC();
		m.giveMortgage();
		
		Investments i = new PNC();
		i.doInvestments();
		
		System.out.println("---BOA---");
		
		Bank b1 = new BOA();
		b1.trust();
		b1.deposit();
		b1.withdraw();
		
		Investments i1 = new BOA();
		i1.doInvestments();
		
		
		
		
		
		
	}

}
