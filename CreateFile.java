import java.io.*;
class CreateFile
{
	public static void main(String a[])throws IOException
	{
		File f=new File("C:\\JavaLab\\example.html");
		if(f.createNewFile())
		{
			System.out.print("file Created");
		}
		else
		{
			System.out.print("file already exists");
		}
	}
}