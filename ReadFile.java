import java.io.*;
class ReadFile
{
	public static void main(String a[])throws IOException
	{
		FileReader f=new FileReader("C:\\JavaLab\\testing.txt");
		try
		{
			int i;
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		finally
		{
			f.close();
			System.out.println("");
			System.out.println("yaha intnahi hee agar tume kuch or chahie tho jakar google mee padoo");
		}
	}
}