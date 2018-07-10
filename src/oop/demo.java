package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		Person person2 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "123456";
		person2.name = "Sarah";
		person2.email = "Sarah@testmail.com";
		person2.phone = "678899";
				
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		person2.walk();
		person2.sleep();
		person2.eat();
	}

}
