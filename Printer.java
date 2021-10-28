package com.xworkz.polymorphism;

public class Printer {
public Printer() {
	System.out.println("inside printer");
}
public void printer() {
	System.out.println("inside printer method");
	System.out.println("print the document in default setting");
}
public void printer(String size) {
	System.out.println("inside printer method");
	System.out.println("print the document based on size"+size);
}
public void printer(int startIndex,int lastIndex) {
	System.out.println("inside printer method");
	System.out.println("print the document from "+startIndex+"to"+lastIndex);
}
}
