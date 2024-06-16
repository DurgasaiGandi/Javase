import java.io.*;
class WriteFile
{
	public static void main(String a[])throws IOException
	{
		FileWriter f=new FileWriter("C:\\JavaLab\\testing.txt");
		try
		{
			f.write("Dukki chavu Paniki Mallina Edhava");
		}
		finally
		{
			f.close();
			System.out.print("I wrote it go to hell n check that file u ......");
		}
	}
}