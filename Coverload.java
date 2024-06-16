class Area
{
	Area(int s)
	{
		System.out.println("Area of a Square="+(s*s));
	}
	Area(int l, int b)
	{
		System.out.println("Area of a Rectangle="+(l*b));
	}
	Area(float base, float height)
	{
		System.out.println("Area of a Triangle="+(0.5f*base*height));
	}
	Area(float r)
	{
		System.out.println("Area of a Circle="+(3.14*r*r));
	}
}

class Coverload
{
	public static void main(String args[])
	{
	Area a1=new Area(5);
	Area a2=new Area(10,5);
	Area a3=new Area(5.3f,4.3f);
	Area a4=new Area(7.0f);
	}
}