package com.xworkz.polymorphism;

public class GooglePay {
	public void billPayment(long cardnumber,String Name,double amount) {
		System.out.println("credit card bill payment successfull");
	}
	public void billPayment(long mobnumber,double amount) {
		System.out.println("postpaid bill payment successfull");
	}
	public void billPayment(String billername,double amount) {
		System.out.println("electricity bill payment successfull");
	}
	public void billPayment(int RRnumber,double amount) {
		System.out.println("water bill payment successfull");
	}

}
