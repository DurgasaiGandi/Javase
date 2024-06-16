class Shapes
{
    void Area(int s)
    {
        System.out.println("Area of a Square="+(s*s));
    }

    void Area(int Length, int Breadth) 
    {
        System.out.println("Area of Rectangle=" + (Length * Breadth));
    }
    void Area(float base, float height)
    {
        System.out.println("Area of Traingle="+0.5f*base*height);
    }
    void Area(float r)
    {
        System.out.println("Area of a circle"+(3.14f*r*r));
    }
}
   class MethodOverload
   {
       public static void main(String[] args)
       {
           Shapes a = new Shapes();
           a.Area(5);
           a.Area(10, 5);
           a.Area(5.3f, 4.3f);
           a.Area(7.0f);
       }

   }