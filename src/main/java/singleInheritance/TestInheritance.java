package singleInheritance;
class Animal{  
	void eat(){System.out.println("eating...");}  
} 

class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
} 

class TestInheritance{  
	public static void main(String args[]){  
		Dog d=new Dog();  //creating a dog object 
		d.bark();  // using the dog object to call method from dog class
		d.eat();  // using the dog object to call method from animal class
	}}  