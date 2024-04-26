package multilevel_Inheritance;
class Animal{  
	void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
}  

class BabyDog extends Dog{  
	void weep(){System.out.println("weeping...");}  
} 

class TestInheritance2{  
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  // creating baby dog object 
		d.weep();  // using baby dog object to access weep method from baby dog class
		d.bark(); // using baby dog object to access bark method from dog class 
		d.eat();  //  using baby dog object to access eat method from animal
}}  