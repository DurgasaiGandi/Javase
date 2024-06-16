 class base
{
	void display1()
	{
		System.out.println("I am in base class display 1");
	}
	void display2()
	{
		System.out.println("I am in base class display 2");
	}
}

class derived extends base
{
	void display1()
	{
		System.out.println("I am in derived class display 1");
	}
	void display3()
	{
		System.out.println("I am in derived class display 3");
	}
}

class Moverride
{
	public static void main(String args[])
	{
		derived d=new derived();
		d.display1();
		d.display2();
		d.display3();
	}
}