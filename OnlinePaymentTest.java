package com.xworkz.polymorphism;

public class OnlinePaymentTest {
public static void main(String[] args) {
	GooglePe googlePe = new GooglePe();
	googlePe.moneyTransfer();
	PhonePay phonePay = new PhonePay();
	phonePay.moneyTransfer();
}
}
