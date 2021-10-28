package com.xworkz.polymorphism;

public class SignUp {
public SignUp() {
	System.out.println("inside the sign up");
}
public void userSignUp(String email,String password) {
	System.out.println("inside the email signup method");
	System.out.println("sign up through email successfull");
}
public void userSignUp(long phone,String password) {
	System.out.println("inside the phonenumber signup method");
	System.out.println("sign up through phone number successfull");
}
}
