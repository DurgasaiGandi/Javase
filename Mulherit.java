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
class Labrador extends Dog 
{ 
    	void color() 
	{ 
        	System.out.println("Labrador is black"); 
    	} 
}

class Mulherit
{
	public static void main(String args[])
	{
		Labrador l = new Labrador();
		l.color();
		l.bark();
		l.eat();
	}
}