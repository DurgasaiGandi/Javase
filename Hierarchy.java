class Animal 
{ 
    	void eat() 
	{ 
        	System.out.println("Animal is eating"); 
    	} 
} 
class Dog extends Animal 
{ 
    	void bark() 
	{ 
        	System.out.println("Dog is barking"); 
    	} 
} 
 
class Cat extends Animal 
{ 
    	void meow() 
	{ 
        	System.out.println("Cat is meowing"); 
    	} 
}
class Hierarchy
{
	public static void main(string args[])
	{
		Dog d=new Dog();
		Cat c=new Cat();
		d.eat();
		d.bark();
		c.meow();
		c.bark();
	}
}