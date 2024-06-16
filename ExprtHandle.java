import java.util.Scanner;
public class ExprtHandle
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		String str = sc.nextLine();
        	try 
		{
            		int result = 10 / a1;
		        String str1 = "120";
            		print(str1.indexOf(str.length()+str1.length()));
	        }
		catch (ArithmeticException e) 
		{
	        	System.out.println("ArithmeticException occurred!");
	        }
		catch (NullPointerException e) 
		{
            		System.out.println("NullPointerException occurred!");
	        }
		catch (ArrayIndexOutOfBoundsException e) 
		{
            		System.out.println("ArrayIndexOutOfBoundsException occurred!");
        	} 
		catch (NumberFormatException e) 
		{
            		System.out.println("NumberFormatException occurred!");
	        } 
		catch (Exception e) 
		{
            		System.out.println("Some other exception occurred!");
        	} 
		finally 
		{
            		System.out.println("Finally block executed!");
        	}
    }
}