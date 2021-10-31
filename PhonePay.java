package com.xworkz.polymorphism;

public class PhonePay extends OnlinePayment {
public PhonePay() {
	System.out.println("Online payment using Phonepay");
}
public void moneyTransfer() {
	super.moneyTransfer();
	System.out.println("money transferred using rupayt successfullll");
}
}
